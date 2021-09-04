package contest.D;
/*
								"जय श्री कृष्णा"
*/
import java.util.*;
import java.io.*;

public class Cleaning_696 implements Runnable {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int[] nextIntArray(int size) {
			int[] arr = new int[size];
			for (int i = 0; i < size; ++i)
				arr[i] = nextInt();
			return arr;
		}

		long[] nextLongArray(int size) {
			long[] arr = new long[size];
			for (int i = 0; i < size; ++i)
				arr[i] = nextLong();
			return arr;
		}

		double[] nextDoubleArray(int size) {
			double[] arr = new double[size];
			for (int i = 0; i < size; ++i)
				arr[i] = nextDouble();
			return arr;
		}
	}

	static int mod = (int) (1e9 + 7);
	static final PrintWriter out=new PrintWriter(System.out, true);
	public static void main(String[] args) throws java.lang.Exception {
		new Thread(null, new Cleaning_696(), "Main", 1 << 26).start();
	}
	static void swap(int a[], int x, int y) {
		a[x]^=a[y];
		a[y]^=a[x];
		a[x]^=a[y];
	}
	static boolean check(int a[]) {
		int x[]=Arrays.copyOf(a, a.length);
		for(int i=0; i<a.length-1; i++) {
			if(x[i]>x[i+1]) return false;
			x[i+1]-=x[i];
		}
		if(x[x.length-1]==0) return true;
		return false;
	}
	@Override
	public void run() {
		long start = System.nanoTime(); // Program Start
		FastReader fr = new FastReader();
		boolean testcase = true;
		int t = testcase ? fr.nextInt() : 1;
		outer:
		while (t-- > 0) {
			int n = fr.nextInt();
			int a[] = fr.nextIntArray(n),b[]=Arrays.copyOf(a, n);
			if(check(a)) {
				out.print("YES\n");
				out.flush();
				continue;
			}
			swap(a,0,1);
			if(check(a)) {
				out.print("YES\n");
				out.flush();
				continue;
			}
			swap(a,0,1);
			swap(a,n-2, n-1);
			if(check(a)) {
				out.print("YES\n");
				out.flush();
				continue;
			}
			swap(a,n-2,n-1);
			int p[]=new int[n],s[]=new int[n];
			boolean ok=false;
			p[0]=b[0];
			for(int i=1; i<n; i++) {
				if(b[i-1]>b[i] || p[i-1]==-1) {
					p[i]=-1;
				}else {
					b[i]-=b[i-1];
					b[i-1]=0;
					p[i]=b[i];
				}
			}
			b=Arrays.copyOf(a, n);
			s[n-1]=b[n-1];
			for(int i=n-2; i>=0; i--) {
				if(s[i+1]==-1 || b[i+1]>b[i]) {
					s[i]=-1;
				}else {
					b[i]-=b[i+1];
					b[i+1]=0;
					s[i]=b[i];
				}	
			}

			for(int i=1; i<n-2; i++) {
				int pos[]= {p[i-1],a[i],a[i+1],s[i+2]};
				if(p[i-1]==-1 || s[i+2]==-1) continue;
				swap(pos, 1, 2);
				if(check(pos)) {
					out.print("YES\n");
					out.flush();
					continue outer;
				}
			}
			out.print("NO\n");
			out.flush();
		}
		long end = System.nanoTime(); // Program End
		System.err.println("Time taken: " + (end - start) / 1000000 + " ms");
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

		static void sort(int a[]) {
			PriorityQueue<Integer> q = new PriorityQueue<>();
			for (int i = 0; i < a.length; i++)
				q.add(a[i]);
			for (int i = 0; i < a.length; i++)
				a[i] = q.poll();
		}
		static void print_ar(int arr[]) {
			for(int x: arr) out.print(x+" ");
			out.println();
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

