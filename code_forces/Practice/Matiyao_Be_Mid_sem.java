package Gym.Net_Hunter.IIT;
import java.util.*;
import java.io.*;
 
public class Matiyao_Be_Mid_sem implements Runnable {

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
			for (int i = 0; i < size; ++i) {
				arr[i] = nextLong();
				min=Math.min(arr[i], min);
			}
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
	static long min=Long.MAX_VALUE;
	static class Pair implements Comparable<Pair>{
		int f;long s;
		Pair(int f, long s) {this.f=f;this.s=s;}
		@Override
		public int compareTo(Pair o) {
			return Long.compare(o.s,this.s);
		}
	}
	public static void main(String[] args) throws java.lang.Exception {
		new Thread(null, new Matiyao_Be_Mid_sem(), "Main", 1 << 26).start();
	}

	@Override
	public void run() {
		long start = System.nanoTime(); // Program Start
		FastReader fr = new FastReader();
		int t = 1;
		while (t-- > 0) {
			int n = fr.nextInt(),m=fr.nextInt();
		    PriorityQueue<Long> q=new PriorityQueue<>();
		    long sum=0;
		    for(int i=0; i<n; i++) {
		    	long x=fr.nextLong();
		    	sum+=x;
		    	q.add(x);
		    }
		    Pair pa[]=new Pair[m];
		    for(int i=0; i<m; i++) {
		    	pa[i]=new Pair(fr.nextInt(),fr.nextInt());
		    }
//		    System.out.println(sum);
		    Arrays.sort(pa);
		    outer:
		    for(int i=0; i<m; i++) {
		    	boolean ok=false;
		    	long f=pa[i].f,s=pa[i].s,c=0;
		    	while(!q.isEmpty()) {
		    		long e=q.poll();
//		    		System.out.println(e);
		    		if(e<s && c<f) {
		    			++c;
		    			ok=true;
		    			sum-=e;
		    			sum+=s;
		    			q.add(s);
//		    			System.out.println(s+" "+e);
		    			if(c==f) break ;
		    		}
		    	}
		    	if(!ok) break;
		    }
		    System.out.println(sum);
		}
		long end = System.nanoTime(); // Program End
		System.err.println("Time taken: " + (end - start) / 1000000 + " ms");
	}
}

	
	


