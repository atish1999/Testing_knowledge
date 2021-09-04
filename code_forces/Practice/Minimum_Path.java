package contest.E;
import java.util.*;
import java.io.*;

public class Minimum_Path implements Runnable {

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
	static List<Pair> adj[];
	static boolean vis[];
	public static void main(String[] args) throws java.lang.Exception {
		new Thread(null, new Minimum_Path(), "Main", 1 << 26).start();
	}
	static class Pair implements Comparable<Pair> {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Pair o) {
			return this.y-o.y;
		}

	}
	static Integer dis[];
	static int n,m;
	static void dijkstra(int  s) {
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		pq.add(new Pair(s,0));
		Integer par[]=new Integer[dis.length];
		par[s]=-1;
		while(!pq.isEmpty()) {
			int f=pq.peek().x,d=pq.peek().y;
			pq.poll();
			for(Pair p: adj[f]) {
				int node=p.x,w=p.y;
				if(d+w<dis[node]) {
					dis[node]=d+w;
					par[node]=f;
					pq.add(new Pair(node, dis[node]));
				}
			}
		}
		for(int i=1; i<=n; i++)
			System.out.println(par[i]+" ");
//		for(int i=1; i<dis.length; i++) System.out.print(dis[i]+" ");
//		System.out.println();
//		List<Integer> path = new ArrayList<>();
//		
//		for(Integer cur=n; cur!=-1; cur=par[cur]) {
//			path.add(cur);
//		}
//		Collections.reverse(path);
//		path.forEach(e->System.out.print(e+" "));
	}
	@Override
	public void run() {
		long start = System.nanoTime(); // Program Start
		FastReader fr = new FastReader();
		boolean testcase = false;
		int t = testcase ? fr.nextInt() : 1;
		while (t-- > 0) {
			n = fr.nextInt(); m = fr.nextInt();
			dis=new Integer[n + 1];
			Arrays.fill(dis, Integer.MAX_VALUE);
			adj = new ArrayList[n + 1];
			for (int i = 1; i <= n; i++)
				adj[i] = new ArrayList<>();
			for (int i = 0; i < m; i++) {
				int u = fr.nextInt(), v = fr.nextInt(),w=fr.nextInt();
				adj[u].add(new Pair(v,w));
				adj[v].add(new Pair(u,w));
			}
			dijkstra(1);
		}
		long end = System.nanoTime(); // Program End
		System.err.println("Time taken: " + (end - start) / 1000000 + " ms");
	}
}
