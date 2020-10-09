package code_forces.EDU.Binary_Search.other_problems;
import java.util.*;
import java.io.*;

public class Sages_Birthday_easy_version_671D1 {

	static int mod = (int) (1e9 + 7);
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=1;
		while (t--> 0) {
			int n=Integer.parseInt(br.readLine());
			long a[]=new long[n];
			StringTokenizer s = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Long.parseLong(s.nextToken());
			CP.sort(a);
			int x=(n-2);
			System.out.println((x&1)==1?(x+1)/2:x/2);
			int j=n-1,i=0;
			while(i<j) {
				System.out.print(a[j]+" "+a[i]+" ");
				--j;++i;
			}
			if((n&1)==1) System.out.print(a[j]);
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

		static void sort(long a[]) {
			PriorityQueue<Long> q = new PriorityQueue<>();
			for (int i = 0; i < a.length; i++)
				q.add(a[i]);
			for (int i = 0; i < a.length; i++)
				a[i] = q.poll();
		}

	}
}
