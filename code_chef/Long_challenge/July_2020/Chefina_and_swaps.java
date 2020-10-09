package code_chef.Long_challenge.July_2020;
import java.util.*;
import java.io.*;
public class Chefina_and_swaps {
/*
	Some observations:
	(1)each elements must be present even number of times
		example-1:       
		3
		1 2 3
		2 1 4
		ans=-1(i.e. ans doesn't exist i.e. frequency of 3 and 4 is odd in this case)
	(2)Remove all elements which are common to both arrays(because we don't have to
	   swap that elements)
		example:
			5
			1 1 2 4 5
			2 3 3 4 5
		(from here we should remove 2, 4 and 5)
		and resulting array will be
		    1 1
		    3 3
	(3) After removing all elemnts which are common to both array, 
	    the number of remaining	elements are same in both arrays.
	     1 1 -> no. of elements present in A is 2
		 3 3 -> no. of elements present in B is 2
	(4) what ever elements are left in the array half of the elemnts will be 
		transferred. i.e.here
		1-> 1 would be transferred to B
		3-> 3 would be transferred to A
	(5)move greedily
	(6) Swapping:
		We can say that if x is a minimum element and we want to swap 
		A[i]and B[j] for some valid i and j then there are two ways to do that:
		(i) Direct swap->swap(A[i],B[j]) and in this case min cost=min(A[i],B[j])
		(ii) using minimum element-> first swap(A[i],x) them swap(b[j],x) or vice versa
			and in this case minimum cost would be 2*x.
	
	example:
	1						step-1			step-2				step-3
	8   ->removing common elements	->taking half of the remaining elements.	
	2 2 3 3 3 3 4 4  		3 3 3 3 4 4		3 3 4 		min(2*2,3,6)+min(2*2,3,6)+
	2 2 2 2 6 6 6 6			2 2 6 6 6 6		6 6 2 		min(2*2,4,2)
														=3+3+2=8(ans)
	here min=2.
	
*/

	static int mod = (int) (1e9 + 7);
	public static void main(String[] args) throws java.lang.Exception 
    {		
		//O(Nlog(N))
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),checkOdd=0;
			long min=mod;
			StringTokenizer st=new StringTokenizer(br.readLine());
			Map<Integer, Integer> a=new TreeMap<>();
			for(int i=0; i<n; i++) {
				int x=Integer.parseInt(st.nextToken());
				a.put(x, a.getOrDefault(x, 0)+1);
			}
			st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				int x=Integer.parseInt(st.nextToken());
				a.put(x, a.getOrDefault(x, 0)-1);// removing elemnts.
			}
			boolean flag=true;
			List<Integer> A=new ArrayList<>(),B=new ArrayList<>();
			for(int x: a.keySet()) {
				min=Math.min(min, x);
				int p=Math.abs(a.get(x));
				if((p&1)==1) {flag=false; break;}
				p=a.get(x);
				if(p>0) {// after removing common elemnts
					p/=2;//elements whose frequency positive
					while(p-->0) A.add(x);//half of the elemnt should be added to A
				}else if(p<0) { // after removing common elemnts
					p=Math.abs(p)/2;//elements whose frequency negative 
					while(p-->0) B.add(x);//half of the elemnt should be added to B
				}
			}
			if(!flag) {System.out.println(-1);continue;}
			long cost=0;
//	 we are moving greedily here, cost will be minimum if we swap smallest elemnt of A
//   let's say A[i] with largest elemnt of B i.e. B[j].
//   or we can swap 2 times with minimum of A and B let's say x with A[i] and B[j]
//	 ans =min(2*minimum of A and B, A[i], B[j])
			Collections.reverse(B);
			for(int i=0; i<A.size(); i++)
				cost+=Math.min(2*min, Math.min(A.get(i), B.get(i)));
			System.out.println(cost);
		}
		System.out.flush();

	}
	static void solve() throws java.lang.Exception //O(n) or higher <[got TLE]>
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),checkOdd=0;
			long min=mod;
			StringTokenizer st=new StringTokenizer(br.readLine());
			Map<Long, Integer> a=new TreeMap<>(),b=new TreeMap<>();
			for(int i=0; i<n; i++) {
				long x=Integer.parseInt(st.nextToken());
				checkOdd^=x;
				a.put(x, a.getOrDefault(x, 0)+1);
				min=Math.min(min, x);
			}
			st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				long x=Integer.parseInt(st.nextToken());
				checkOdd^=x;
				b.put(x, b.getOrDefault(x, 0)+1);
				min=Math.min(min, x);
			}
			if(checkOdd!=0) {System.out.println(-1); continue;}
			if(a.equals(b)) {System.out.println(0);continue;}
			List<Long> A=new ArrayList<>(),B=new ArrayList<>();
//			Removing pair of common elements from a and b 
			for(Long x: a.keySet()) {
				if(b.containsKey(x)) {
					int d=Math.min(a.get(x), b.get(x));
					a.put(x, a.get(x)-d);
					b.put(x, b.get(x)-d);
				}
			}
			for(Long x: a.keySet()) for(int i=0; i<a.get(x)/2; i++) A.add(x);
			for(Long x: b.keySet()) for(int i=0; i<b.get(x)/2; i++) B.add(x);
//			As we are using treeMap then keys will be sorted
			Collections.reverse(B);
			long cost=0;
			for (int i = 0; i < A.size(); i++) cost+=Math.min(2*min, Math.min(A.get(i), B.get(i)));
			System.out.println(cost);
		}
		System.out.flush();

	}
	static class CP {

		static long binary_Expo(long a, long b) { // calculating a^b
			long res = 1;
			while (b != 0) {
				if ((b & 1) == 1) {
					res *= a;
					--b;
				}
				a *= a;
				b /= 2;
			}
			return res;
		}

		static long Modular_Expo(long a, long b) {
			long res = 1;
			while (b != 0) {
				if ((b & 1) == 1) {
					res = (res * a) % mod;
					--b;
				}
				a = (a * a) % mod;
				b /= 2;
			}
			return res;
		}

		static long gcd(long a, long b) {// here b is the remainder
			if (b == 0)
				return a; //because each time b will divide a.
			return gcd(b, a % b);
		}

		static long ceil_div(long a, long b) { // a numerator b denominator
			return (a + b - 1) / b;
		}

		static int getIthBitFromInt(int bits, int i) {
			return (bits >> (i - 1)) & 1;
		}

		static int upper_Bound(int a[], int x) {//closest to the left+1
			int l = -1, r = a.length;
			while (l + 1 < r) {
				int m = (l + r) >>> 1;
				if (a[m] <= x)
					l = m;
				else
					r = m;
			}
			return l + 1;
		}

		static int lower_Bound(int a[], int x) {//closest to the right
			int l = -1, r = a.length;
			while (l + 1 < r) {
				int m = (l + r) >>> 1;
				if (a[m] >= x)
					r = m;
				else
					l = m;
			}
			return r;
		}

		static void sort(int a[]) {
			PriorityQueue<Integer> q = new PriorityQueue<>();
			for (int i = 0; i < a.length; i++)
				q.add(a[i]);
			for (int i = 0; i < a.length; i++)
				a[i] = q.poll();
		}

	}

}
