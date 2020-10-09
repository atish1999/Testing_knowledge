package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Petya_and_Staircases {

	public static void main(String[] args)throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		if(m==0) System.out.println("YES");
		else {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int d[]=new int[m];
			for(int i=0; i<m; i++) d[i]=Integer.parseInt(s.nextToken());
			Arrays.sort(d);
			if(d[d.length-1]==n || d[0]==1) System.out.println("NO");
			else {
				boolean ok=true;
				for(int i=0; i<m-2; i++) {
					if(d[i]+1==d[i+1] && d[i+1]+1==d[i+2]) {ok=false;break;}
				}
				System.out.println(!ok?"NO":"YES");
			}
		}
//	public static void main(String[] args)throws java.lang.Exception {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
//		if(m==0) System.out.println("YES");
//		else {
//			StringTokenizer s = new StringTokenizer(br.readLine());
//			int d[]=new int[m];
//			for(int i=0; i<m; i++) d[i]=Integer.parseInt(s.nextToken());
//			Arrays.sort(d);
//			if(d[d.length-1]==n || d[0]==1) System.out.println("NO");
//			else {
//				int c=0;
//				for(int i=0; i<m-1; i++) {
//					if(d[i+1]-d[i]==1) ++c;
//					else c=0;
//					if(c==2) break;
//				}
//				System.out.println(c==2?"NO":"YES");
//			}
//		}
//	}
	}
}
