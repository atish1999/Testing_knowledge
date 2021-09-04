class Search {
 
	/**
	 * Binary search algorithm searches for target value over given array of long
	 * values in the given range of indices.
	 * 
	 * If the target value is not found, the first smaller/larger value is returned,
	 * based on provided search option enum value.
	 * 
	 * Complexity: O(logn)
	 * 
	 * E.g. binarySearch(0, array.length - 1, array, 67, SearchOption.MINIMUM)
	 * 
	 * @param low    Lower index bound for the search.
	 * @param high   Upper index bound for the search.
	 * @param array  Array of values to perform search over.
	 * @param target Target value that is searched for.
	 * @param option Choice on how to choose return value if the target is not
	 *               found.
	 * @return Target value if it is found, otherwise first smaller/larger value
	 *         based on given choice.
	 */
	public static int binarySearch(int low, int high, long[] array, long target, SearchOption option) {
		int mid;
		int answer = (option == SearchOption.MINIMUM) ? low : high;
		int cmp;
 
		while (low <=high) {
			mid = (low + high) / 2;
			cmp = Long.valueOf(array[mid]).compareTo(target);
 
			if (cmp == 0) // mid point equal to desired element
				return mid;
			else if (cmp < 0) { // mid point smaller than desired element value
				if (option == SearchOption.MINIMUM) {
					answer = mid;
				}
				low = mid + 1;
			} else { // mid point larger than desired element value
				if (option == SearchOption.MAXIMUM) {
					answer = mid;
				}
				high = mid - 1;
			}
		}
 
		return answer;
	}
 
	/**
	 * Binary search algorithm searches for target value over given range of long
	 * values. It is possible to provide function that is applied to searched values
	 * before comparing with target value.
	 * 
	 * If the target value is not found, the first smaller/larger value is returned,
	 * based on provided search option enum value.
	 * 
	 * Complexity: O(logn)
	 * 
	 * E.g. binarySearch(0, 500, Function.identity(), 67, SearchOption.MINIMUM)
	 * 
	 * @param low      Lower bound for the search.
	 * @param high     Upper bound for the search.
	 * @param function Function to apply on searched range before comparing with
	 *                 target value.
	 * @param target   Target value that is searched for.
	 * @param option   Choice on how to choose return value if the target is not
	 *                 found.
	 * @return Target value if it is found, otherwise first smaller/larger value
	 *         based on given choice.
	 */
	public static <R extends Comparable<R>> Long binarySearch(Long low, Long high, Function<Long, R> function, R target,
			SearchOption option) {
		Long mid;
		Long answer = (option == SearchOption.MINIMUM) ? low : high;
		int cmp;
 
		while (low <= high) {
			mid = (low + high) / 2L;
			cmp = function.apply(mid).compareTo(target);
 
			if (cmp == 0) // mid point equal to desired element
				return mid;
			else if (cmp < 0) { // mid point smaller than desired element value
				if (option == SearchOption.MINIMUM) {
					answer = mid;
				}
				low = mid + 1L;
			} else { // mid point larger than desired element value
				if (option == SearchOption.MAXIMUM) {
					answer = mid;
				}
				high = mid - 1L;
			}
		}
 
		return answer;
	}
 
	/**
	 * Ternary search algorithm searches for minimum/maximum of a unimodal
	 * convex/concave function in the given value range. Function is applied over
	 * range of long values.
	 * 
	 * Complexity: O(logn)
	 * 
	 * E.g. ternarySearch(0,500,Function.identity(), SearchOption.MINIMUM)
	 * 
	 * @param low      Lower bound for the search.
	 * @param high     Upper bound for the search.
	 * @param function Unimodal function given as unary operator over long values.
	 * @param option   Choice on whether to search for minimum or maximum.
	 * @return Long value x such that f(x) is the minimum/maximum of the function.
	 */
	public static <R extends Comparable<R>> Long ternarySearch(Long low, Long high, Function<Long, R> function,
			SearchOption option) {
		Long mid1, mid2;
		int cmp;
 
		while (true) {
			mid1 = (low + high) / 2L;
			mid2 = mid1 + 1L; // Simplifies the code alot!
 
			cmp = function.apply(mid1).compareTo(function.apply(mid2));
 
			if (high <= low + 1L) { // Stopping condition
				if (option == SearchOption.MINIMUM && cmp < 0)
					return mid1;
				else if (option == SearchOption.MAXIMUM && cmp > 0)
					return mid1;
				else
					return mid2;
			}
 
			// Update search interval
			if (cmp < 0) { // f(mid1) < f(mid2)
				if (option == SearchOption.MINIMUM)
					high = mid1;
				else
					low = mid2;
			} else { // f(mid1) >= f(mid2)
				if (option == SearchOption.MINIMUM)
					low = mid2;
				else
					high = mid1;
			}
		}
 
	}
}
 
/**
 * Option to pick first smaller/larger value if the searched value is not found.
 */
enum SearchOption {
	MINIMUM, MAXIMUM
}
