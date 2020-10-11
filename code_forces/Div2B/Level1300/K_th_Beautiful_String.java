package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;

public class K_th_Beautiful_String {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		long start = System.nanoTime(); // Program Start
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()),
			    k=Integer.parseInt(st.nextToken());
			char a[]=new char[n];
			Arrays.fill(a, 'a');
			for(int i=n-2; i>=0; i--) {
//		available position of 1st b or leftmost b will be in between [0,n-2]i.e.(n-i-1)=((n-1)-i)	
				if(k<=(n-i-1)) {
					a[i]=a[n-k]='b';// if k<=((n-1)-i) it means n-k will be the
					System.out.println(a);// suitable position for 2nd b
					break;
				}
				k-=(n-i-1);//(otherwise remove all the string which have
//				the leftmost 'b' at the current position)
			}
		}
		long end = System.nanoTime(); // Program End
		System.err.println("Time taken: " + (end - start) / 1000000 + " ms");
	}
	static void sol1(int n, int k) {
		char a[]=new char[n];
		Arrays.fill(a, 'a');
		--k;//for 0 based indexing
		for(int i=1; ;i++) {
			if(k<i) {
				a[n-i-1]=a[n-k-1]='b';
				break;
			}
			k-=i;
		}
		System.out.println(a);
	}
	static void sol(int n, int k) {//O(2^n*n) it will give TLE
		int c=0;
		outer:
		for(int i=0; i<(1<<n); i++) {
			String ans="";int na=0,nb=0;
			for(int j=0; j<n; j++) {
				if((i&(1<<j))!=0) {
					ans+="a";
					++na;
				}else {
					ans+="b";
					++nb;
				}
			}
			if(na==(n-2) && nb==2) ++c;
			if(c==k) {
				System.out.println(ans);
				break outer;
			}
		}
	}
	
	static class CP {

		static boolean isPrime(long n) {
			if (n <= 1)
				return false;
			if (n == 2 || n == 3)
				return true;
			if (n % 2 == 0 || n % 3 == 0)
				return false;
			for (int i = 5; i * i <= n; i += 6) {
				if (n % i == 0 || n % (i + 2) == 0)
					return false;
			}
			return true;
		}

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

		static int i_gcd(int a, int b) {// iterative way to calculate gcd.
			while (true) {
				if (b == 0)
					return a;
				int c = a;
				a = b;
				b = c % b;
			}
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

		static void sort(int a[]) {//heap sort
			PriorityQueue<Integer> q = new PriorityQueue<>();
			for (int i = 0; i < a.length; i++)
				q.add(a[i]);
			for (int i = 0; i < a.length; i++)
				a[i] = q.poll();
		}

		static void countSort(int arr[], int n, int exp) {
			int output[] = new int[n]; // output array
			int i;
			int count[] = new int[10];
			Arrays.fill(count, 0);

			// Store count of occurrences in count[]
			for (i = 0; i < n; i++)
				count[(arr[i] / exp) % 10]++;

			// Change count[i] so that count[i] now contains
			// actual position of this digit in output[]
			for (i = 1; i < 10; i++)
				count[i] += count[i - 1];

			// Build the output array
			for (i = n - 1; i >= 0; i--) {
				output[count[(arr[i] / exp) % 10] - 1] = arr[i];
				count[(arr[i] / exp) % 10]--;
			}

			// Copy the output array to arr[], so that arr[] now
			// contains sorted numbers according to curent digit
			for (i = 0; i < n; i++)
				arr[i] = output[i];
		}

		// The main function to that sorts arr[] of size n using
		// Radix Sort
		static void radixsort(int arr[], int n) {
			// Find the maximum number to know number of digits
			int m = getMax(arr, n);

			// Do counting sort for every digit. Note that
			// instead of passing digit number, exp is passed.
			// exp is 10^i where i is current digit number
			for (int exp = 1; m / exp > 0; exp *= 10)
				countSort(arr, n, exp);
		}

		static int getMax(int arr[], int n) {
			int mx = arr[0];
			for (int i = 1; i < n; i++)
				if (arr[i] > mx)
					mx = arr[i];
			return mx;
		}
	}
}
