package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Tournament {


	@SuppressWarnings("unchecked")
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		List<Integer> a[]=new ArrayList[n+1];
		for(int i=0; i<n+1; i++) a[i]=new ArrayList<>();
		int deg[]=new int[n+1],win[]=new int[n+1], lose[]=new int[n+1];
		for(int i=0; i<(n*(n-1))/2-1; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken()),v=Integer.parseInt(st.nextToken());
			a[u].add(v);
			a[v].add(u);
			++deg[u];++deg[v];
			++win[u];++lose[v];
		}
		int p=-1,c=-1;
		for(int i=1; i<=n; i++) {
			if(deg[i]!=n-1) {p=i;break;}
		}
		Collections.sort(a[p]);
		for(int i=1; i<=n; i++) {
			if(!a[p].contains(i)) {
				if(p!=i) {c=i;break;}
			}
		}
		System.out.println(win[p]>=win[c]?(p+" "+c):(c+" "+p));
	}

}
