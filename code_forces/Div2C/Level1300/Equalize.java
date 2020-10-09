package code_forces.Div2C.Level1300;
import java.util.*;
import java.io.*;
public class Equalize {

	static long mod=(long)(1e9+7);
	public static void main(String[] args) throws java.lang.Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		char[] a=br.readLine().toCharArray(),b=br.readLine().toCharArray();
		int i=0,ans=0;
		while(i<n) {
			if(a[i]!=b[i]) {
				++ans;
/*
	    we will swap value between 2 indexes only when those indexes are adjacent 
		to each other and both have opposite values. because only then cost will be
		minimum.(i.e. cost will be 1)
		 other wise if the positions are different we should change value
	    either from 0 to 1 or 1 to 0.
*/
				if(i+1<n && a[i+1]!=b[i+1] && a[i]!=a[i+1]) i+=2;
				else ++i;
				continue;
			}
			++i;
		}
		System.out.println(ans);
		
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
