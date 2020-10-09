package code_forces.other_contest.A;
import java.util.*;
import java.io.*;

public class Circle_Coloring {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int a[] = new int[n];
			st = new StringTokenizer(br.readLine());
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			StringTokenizer s2 = new StringTokenizer(br.readLine());
			int c=0;
			for(int i=0; i<n; i++) {
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(s1.nextToken());
				int z = Integer.parseInt(s2.nextToken());
				if(i==0) a[i]=x;
				else if(i<n-1){
					if(a[i-1]!=x) {a[i]=x;continue;}
					else if(a[i-1]!=y) {a[i]=y;continue;}
					else if(a[i-1]!=z) {a[i]=z;continue;}
				}else if(i==n-1) {
					if(a[i-1]!=x && a[0]!=x) {a[i]=x;continue;}
					if(a[i-1]!=y && a[0]!=y) {a[i]=y;continue;}
					if(a[i-1]!=z && a[0]!=z) {a[i]=z;continue;}
				}	
			}
			for(int e: a) System.out.print(e+" ");
			System.out.println();
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

	}
}
