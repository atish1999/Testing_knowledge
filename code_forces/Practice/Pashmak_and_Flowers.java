package random_practice.level1300;
import java.util.*;
import java.io.*;

public class Pashmak_and_Flowers implements Runnable {

	
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
	}

	static int mod = (int) (1e5 + 1);
	static int par[];

	public static void main(String[] args) throws java.lang.Exception {
		new Thread(null, new Pashmak_and_Flowers(), "Main", 1 << 26).start();
	}

	@Override
	public void run() {
		long start = System.nanoTime(); // Program Start
		FastReader fr = new FastReader();
		int t = 1;
		while(t--> 0) {
			int n=fr.nextInt();
			int a[]=new int[n];
			int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
			for(int i=0; i<n; i++) {
				a[i]=fr.nextInt();
				min=Math.min(a[i], min);
				max=Math.max(a[i], max);
			}
			if(min==max) {
				long x=(n-1);
				System.out.println((0)+" "+((x*(x+1))/2));
				return;
			}
			long c1=0,c2=0;
			for(int i=0; i<n; i++) {
				if(a[i]==min) ++c1;
				if(a[i]==max) ++c2;
			}
			System.out.println((max-min)+" "+(c1*c2));
		}
		long end = System.nanoTime(); // Program End
		System.err.println("Time taken: " + (end - start) / 1000000 + " ms");
	}

}
