package code_forces.Div2A;
import java.util.*;
import java.lang.*;
import java.io.*;
public class DZY_love_hash {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p=Integer.parseInt(st.nextToken()),n=Integer.parseInt(st.nextToken());
		Map<Integer, Integer> m = new HashMap<>();
		boolean ok=false;int ans=0;
		for(int i=0; i<n; i++) {
			int a=Integer.parseInt(br.readLine());
			if(m.containsValue(a%p)) {
				ok=true;ans=i+1;
				break;
			}else m.put(a, a%p);
		}
		System.out.println(ok?ans:-1);
	}
//	public static void main(String[] args)throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int p=Integer.parseInt(st.nextToken()),n=Integer.parseInt(st.nextToken());
//		boolean bucket[]=new boolean[p];
//		boolean ok=false;int ans=0;
//		for(int i=0; i<n; i++) {
//			int a=Integer.parseInt(br.readLine()),hash=a%p;
//			if(bucket[hash]) {ok=true;ans=i+1;break;}
//			bucket[hash]=true;
//		}
//		System.out.println(ok?ans:-1);
//	}

}
