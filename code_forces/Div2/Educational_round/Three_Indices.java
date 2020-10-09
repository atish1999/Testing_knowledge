package code_forces.Div2.Educational_round;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Three_Indices {
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
			boolean ok=false,ok1=false;int p1=0,p2=0,p3=0;
			for(int i=1; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					if(a[i]>a[j]) {
						ok=true;p3=j+1;p2=i+1;
						break;
					}
				}
				for(int j=i-1; j>=0; j--) {
					if(a[i]>a[j] && p2==i+1) {
						ok1=true;p1=j+1;
						break;
					}
				}
				if(ok && ok1) break;
			}
			System.out.println(ok && ok1?"YES\n"+p1+" "+p2+" "+p3:"NO");
		}
	}

//	public static void main(String[] args) throws java.lang.Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
//			boolean ok=false;int p1=0,p2=0,p3=0;
//			for(int i=1; i<n-1; i++) {
//				if(a[i]>a[i-1] && a[i]>a[i+1]) {
//					ok=true;
//					p1=i;p2=i+1;p3=i+2;
//					break;
//				}
//			}
//			System.out.println(ok?"YES\n"+p1+" "+p2+" "+p3:"NO");
//		}
//	}

}
