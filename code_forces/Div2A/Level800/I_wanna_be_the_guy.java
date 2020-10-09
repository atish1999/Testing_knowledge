package code_forces.Div2A.Level800;
import java.io.*;
import java.util.*;
public class I_wanna_be_the_guy {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a[]=new int[250];
//		int x=Integer.parseInt(st.nextToken()),p[]=new int[x];
//		for(int i=0; i<x; i++) {
//			p[i]=Integer.parseInt(st.nextToken());
//		}
//		StringTokenizer s = new StringTokenizer(br.readLine());
//		int y=Integer.parseInt(s.nextToken()),q[]=new int[y];
//		for(int i=0; i<y; i++) {
//			q[i]=Integer.parseInt(s.nextToken());
//		}
//		int r[]=new int[x+y],c=0;
//		for(int i=0; i<x+y; i++) {
//			if(i<x) r[i]=p[i];
//			else {
//				r[i]=q[c];
//				++c;
//			}
//		}
//		boolean ok =false;
//		for(int i=1; i<=n; i++) {
//			ok=false;
//			for(int j=0; j<x+y; j++) {
//				if(i==r[j]) {
//					ok=true;
//					break;
//				}
//			}
//			if(!ok) {
//				System.out.println("Oh, my keyboard!");
//				break;
//			}
//		}
//		if(ok) System.out.println("I become the guy.");
//	
		int p=Integer.parseInt(st.nextToken()),count=0;
		for(int i=0; i<p; ++i) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		StringTokenizer s = new StringTokenizer(br.readLine());
		int q=Integer.parseInt(s.nextToken());
		for(int i=p; i<p+q; i++) {
			a[i]=Integer.parseInt(s.nextToken());
		}
		Arrays.sort(a, 0, p+q);
			for(int i=0; i<p+q; i++) {
				if(a[i]!=a[i+1] && a[i]!=0) ++count;
	
			}
		System.out.println(count==n?"I become the guy.":"Oh, my keyboard!");
	}

}
