package random_practice.level1400;
import java.util.*;
import java.io.*;

public class Two_Buttons_B implements Runnable {

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

	static int mod = (int) (1e7+1),n,m;
	static List<Integer> adj[];
	static boolean vis[],vis_graph[];
	static int dis[]=new int[mod];
	public static void main(String[] args) throws java.lang.Exception {
		new Thread(null, new Two_Buttons_B(), "Main", 1 << 26).start();
	}

	static void create_graph(int s) {
		
		if(s!=m  && !vis_graph[s]) {
			vis_graph[s]=true;
			adj[s]=new ArrayList<>();	
			adj[s].add(2*s);
			adj[s].add(s-1);
			if(s<m)create_graph(2*s);
			if(s>1) create_graph(s-1);
			
			
		}
	}
	static void bfs(int s) {
		create_graph(s);
		Queue<Integer> q=new LinkedList<>();
		q.add(s);
		dis[s]=0;
		vis[s]=true;
		while(!q.isEmpty()) {
			int c=q.poll();
			if(c==m) break;
			if(adj[c]==null) continue;
			for(int x: adj[c]) {
				if(!vis[x]) {
					vis[x]=true;
					q.add(x);
					dis[x]=dis[c]+1;
				}
			}
		}
		System.out.println(dis[m]);
	}
	static void print() {
		for(int i=0; i<mod; i++) {
			if(adj[i]!=null && adj[i].size()!=0) {
				System.out.println(i+"->"+adj[i]);
			}
		}
	}
	@Override
	public void run() {
		long start = System.nanoTime(); // Program Start
		FastReader fr = new FastReader();
		boolean testcase = false;
		int t = testcase ? fr.nextInt() : 1;
		while (t-- > 0) {
			 n = fr.nextInt(); m = fr.nextInt();
			 if(n>=m) {
				 System.out.println(n-m);
				 return;
			 }
			 vis=new boolean[mod];
			 vis_graph=new boolean[mod];
			 adj=new ArrayList[mod];
//			 for(int i=0; i<2*m+1; i++) adj[i]=new ArrayList<>();
			 bfs(n);
			 

		}
		long end = System.nanoTime(); // Program End
		System.err.println("Time taken: " + (end - start) / 1000000 + " ms");
	}
}
