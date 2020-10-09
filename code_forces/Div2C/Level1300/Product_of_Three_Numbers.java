package code_forces.Div2C.Level1300;
import java.util.*;
import java.io.*;

public class Product_of_Three_Numbers {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		
/*
	Let a be the minimum divisor of n greater than 1. 
	Then let b be the minimum divisor of n/a that isn't equal a and 1. 
	If n/a*b isn't equal a, b and 1 then the answer is "YES", 
	otherwise the answer is "NO".
	
	Time complexity: O(√n) per query.

*/
//		taking 124 ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			Set<Integer> h=new HashSet<>();
			for(int i=2; i*i<=n; i++) {
				if(n%i==0 && !h.contains(i)) {// we are trying to find a
					h.add(i);
					n/=i;
					break;
				}
			}
			for(int i=2; i*i<=n; i++) {
				if(n%i==0 && !h.contains(i)) {// we are trying to find b
					h.add(i);
					n/=i;
					break;
				}
			}
			if(h.size()<2 ||h.contains(n)|| n==1) System.out.println("NO");
			else {
				System.out.println("YES");
				h.add(n);// this is c
				for(int x: h) System.out.print(x+" ");
				System.out.println();
			}
		}
	}
	static void solve1() throws java.lang.Exception { // taking 140ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n=Long.parseLong(st.nextToken());
			if(CP.isPrime(n)) {System.out.println("NO");continue;}
			if((n&1)==0) {
				long x=n/2;
				boolean ok=false;
				for(int i=3; i*i<=x; i++) {
					if(x%i==0 && (x/i)!=i && (x/i)!=2) {
						System.out.println("YES\n"+2+" "+i+" "+(x/i));
						ok=true; break;
					}
				}
				if(!ok) System.out.println("NO");
			}else {
				boolean ok=false;
				outer:
				for(int i=3; i*i<=n; i+=2) {
					if(n%i==0 &&(n/i)!=i) {
						long x=(n/i);
						for(int j=3; j*j<=x; j+=2) {
							if(x%j==0 && i!=j && (x/j)!=i && (x/j)!=j) {
								System.out.println("YES\n"+i+" "+j+" "+(x/j));
								ok=true;
								break outer;
							}
						}
					}
				}
				if(!ok) System.out.println("NO");
			}
		}
	}
	static void solve2()throws java.lang.Exception {//taking 155 ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n=Long.parseLong(st.nextToken());
			if(CP.isPrime(n)) {System.out.println("NO");continue;}
			boolean ok=false;
			outer:
			for(int i=2; i*i<=n; i++) {
				if(n%i==0 && (n/i)!=i) {
					long x=(n/i);
					for(int j=2; j*j<=x; j++) {
						if(x%j==0 && i!=j && j!=(x/j) && (x/j)!=i) {
							System.out.println("YES\n"+i+" "+j+" "+(x/j));
							ok=true;
							break outer;
						}
					}
				}
			}
			if(!ok)System.out.println("NO");
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