package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Xenia_and_ring_road {
	
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		long t=0,c=0;
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			long a=Long.parseLong(s.nextToken());
			if(i==0) t=a-1;
			else {
				if(a>=c) t+=a-c;
				else t+=n+a-c;
			}
			c=a;
		}
		System.out.println(t);
	}

//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
//		long a[]=new long[m];
//		StringTokenizer s = new StringTokenizer(br.readLine());
//		for(int i=0; i<m; i++) a[i]=Long.parseLong(s.nextToken());
//		long t=a[0]-1;
//		for(int i=1; i<m; i++) {
//			if(a[i]>=a[i-1]) t+=a[i]-a[i-1];
//			else t+=(n-a[i-1]+a[i]);
//		}
//		System.out.println(t);
//	}

}
