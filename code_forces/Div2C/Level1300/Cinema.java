package code_forces.Div2C.Level1300;
import java.util.*;
import java.io.*;
public class Cinema {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Map<Integer, Integer> m=new HashMap<>();
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int a=Integer.parseInt(st.nextToken());
//			if(!m.containsKey(a)) m.put(a, 1);
//			else m.put(a, m.get(a)+1);
//			or m.put(a, m.getOrDefault(a, 0) + 1);
			int count=m.getOrDefault(a, 0);
			m.put(a, ++count);
		}
		int k=Integer.parseInt(br.readLine());
		int au[]=new int[k],su[]=new int[k];
		st=new StringTokenizer(br.readLine());
		StringTokenizer s=new StringTokenizer(br.readLine());
		long max=Long.MIN_VALUE;
		int ans=0;
		for(int i=0; i<k; i++) {
			au[i]=Integer.parseInt(st.nextToken());
			su[i]=Integer.parseInt(s.nextToken());
			int x=m.getOrDefault(au[i], 0);
			if(max<x) {
				max=x;
				ans=i;
			}else if(max==x) {
				int y=m.getOrDefault(su[i], 0);
				int z=m.getOrDefault(su[ans], 0);
				if(y>z) {ans=i;max=x;}
			}
		}
		System.out.println(ans+1);
	}

}
