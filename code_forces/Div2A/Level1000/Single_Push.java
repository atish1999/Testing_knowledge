package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Single_Push {
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			StringTokenizer st=new StringTokenizer(br.readLine());
			StringTokenizer s=new StringTokenizer(br.readLine());
			int a[]=new int[n],b[]=new int[n];
			List<Integer> l=new ArrayList<>();
			int c=0;
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(st.nextToken());
				b[i]=Integer.parseInt(s.nextToken());
				if(a[i]!=b[i]) c=b[i]-a[i];
				if(c<0) break;
			}
			if(c<0) System.out.println("NO");
			else {
				boolean flag=true;
				for(int i=0; i<n; i++) {
					int d=b[i]-a[i];
					if(d==c) l.add(i);
					else if(d!=0 && d!=c) {flag=false;break;}
				}
				if(!flag) System.out.println("NO");
				else {
					if(l.size()==0) System.out.println("YES");
					else {
						boolean ok=true;
						for(int i=0; i<l.size()-1; i++) {
							if(l.get(i+1)-l.get(i)!=1) {ok=false;break;}
						}
						System.out.println(ok?"YES":"NO");
					}
				}
			}
		}

	}


}

//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			int n=Integer.parseInt(br.readLine());
//			StringTokenizer st=new StringTokenizer(br.readLine());
//			StringTokenizer s=new StringTokenizer(br.readLine());
//			int a[]=new int[n],b[]=new int[n];
//			List<Integer> l=new ArrayList<>();
//			boolean f=true;int c=0;
//			for(int i=0; i<n; i++) {
//				a[i]=Integer.parseInt(st.nextToken());
//				b[i]=Integer.parseInt(s.nextToken());
//				if(a[i]<b[i]) c=b[i]-a[i];
//				if(a[i]>b[i]) {f=false;break;}
//			}
//			if(!f) System.out.println("NO");
//			else {
//				boolean flag=true;
//				for(int i=0; i<n; i++) {
//					int d=b[i]-a[i];
//					if(d==c) l.add(i);
//					else if(d!=0 && d!=c) {flag=false;break;}
//				}
//				if(!flag) System.out.println("NO");
//				else {
//					if(l.size()==0) System.out.println("YES");
//					else {
//						boolean ok=true;
//						for(int i=0; i<l.size()-1; i++) {
//							if(l.get(i+1)-l.get(i)!=1) {ok=false;break;}
//						}
//						System.out.println(ok?"YES":"NO");
//					}
//				}
//			}
//		}
//
//	}
//
//}
