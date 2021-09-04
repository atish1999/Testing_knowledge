package contest.C;
import java.util.*;
import java.io.*;

public class Array_Destruction_696 implements Runnable {

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
	static int cnt[]=new int[(int)(1e6+12)];
	public static void main(String[] args) throws java.lang.Exception {
		new Thread(null, new Array_Destruction_696(), "Main", 1 << 26).start();
	}
	static void reset(int a[]) {
		for(int i=0; i<a.length; i++) {
			cnt[a[i]]=0;
		}
	}
	@Override
	public void run() {
		long start = System.nanoTime(); // Program Start
		FastReader fr = new FastReader();
		PrintWriter out=new PrintWriter(System.out);
		boolean testcase = true;
		int t = testcase ? fr.nextInt() : 1;
		outer:
		while (t-- > 0) {
			int n = fr.nextInt();
			int a[]=fr.nextIntArray(2*n);
			CP.ruffle_sort(a);
			boolean ok=false;
			for(int i=0; i<2*n-1; i++) {
				for(int j=0; j<2*n; j++) ++cnt[a[j]];//each time updating freq
				int j=2*n-1;
				int x=a[i]+a[j];
				List<Integer> rm=new ArrayList<>();
				for(int op=0; op<n; ++op) {
					while(j>0 && cnt[a[j]]==0) --j;
					rm.add(a[j]);
					rm.add(x-a[j]);
					--cnt[a[j]];
					--cnt[x-a[j]];
					if(cnt[a[j]]<0 || cnt[x-a[j]]<0) {
						cnt[a[j]]=0;
						cnt[x-a[j]]=0;
						break;
					}
					x=Math.max(a[j], x-a[j]);
					if(op==(n-1)) ok=true;
				}
				reset(a);
				if(ok) {
					out.print("YES\n"+(rm.get(0)+rm.get(1))+"\n");
					for(int k=0; k<rm.size()-1; k+=2) {
						out.print(rm.get(k)+" "+rm.get(k+1)+"\n");	
					}
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
		static List<Integer> sieve(int size) {
			ArrayList<Integer> pr=new ArrayList<Integer>();
			boolean prime[] = new boolean[size]; 
		    for(int i=2;i<prime.length;i++)  prime[i] = true; 
			for(int i=2; i*i< prime.length; i++) {
				if(prime[i]) {
					for(int j=i*i; j<prime.length; j+=i) {
						prime[j]=false;
					}
				}
			}
			for(int i=2; i<prime.length; i++) if(prime[i]) pr.add(i);
			return pr;
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

		static void l_sort(int a[]) {
			ArrayList<Integer> al=new ArrayList<>();
			for(int x: a) al.add(x);
			Collections.sort(al);
			for(int i=0; i<a.length; i++) a[i]=al.get(i);
		}
		static void heap_sort(int a[]) { //heap sort
			PriorityQueue<Integer> q = new PriorityQueue<>();
			for (int i = 0; i < a.length; i++)
				q.add(a[i]);
			for (int i = 0; i < a.length; i++)
				a[i] = q.poll();
		}
		static void ruffle_sort(int[] a) {
			//random_shuffle
			Random r=new Random();
			int n=a.length;
			for (int i=0; i<n; i++) {
				int oi=r.nextInt(n);
				int temp=a[i];
				a[i]=a[oi];
				a[oi]=temp;
			}
			
			//sort
			Arrays.sort(a);
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

