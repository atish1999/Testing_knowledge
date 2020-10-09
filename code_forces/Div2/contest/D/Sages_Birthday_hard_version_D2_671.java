package code_forces.Div2.contest.D;
import java.util.*;
import java.io.*;

public class Sages_Birthday_hard_version_D2_671 {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =1;
		while (t--> 0) {
			int n=Integer.parseInt(br.readLine());
			long a[]=new long[n],b[]=new long[n];
			StringTokenizer s = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Long.parseLong(s.nextToken());
			CP.sort(a);
			int l=0;
/*
	insert all the small elements in odd positions and
    insert all the large elements in even positions such that largest
    element should be at index n-1.and second largest would be at n-3 
    and so on....
    and in case of small ones smallest would be at index 1 and 2nd smallest
    would be at 3 and so on...
 */
			for(int i=1; i<n; i+=2) {
				b[i]=a[l];
				++l;
			}
			for(int i=0; i<n; i+=2) {
				b[i]=a[l];
				++l;
			}
			long count=0;
			for(int x=1; x<n-1; ++x) {
				if(b[x]<b[x+1] && b[x]<b[x-1]) ++count;
			}
			System.out.println(count);
			for (long x : b) {
				System.out.print(x+" ");
			}
		}
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

		static void sort(long[] a) {
			PriorityQueue<Long> q = new PriorityQueue<>();
			for (int i = 0; i < a.length; i++)
				q.add(a[i]);
			for (int i = 0; i < a.length; i++)
				a[i] = q.poll();
		}

	}

}
