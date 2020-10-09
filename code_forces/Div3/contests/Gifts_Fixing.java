package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Gifts_Fixing {

	public static void main(String[] args)throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			StringTokenizer s2 = new StringTokenizer(br.readLine());
			long a[]=new long[n],b[]=new long[n],min1=Long.MAX_VALUE,min2=Long.MAX_VALUE,count=0;
			for(int i=0; i<n; i++) {
				a[i]=Long.parseLong(s1.nextToken());b[i]=Long.parseLong(s2.nextToken());
				min1=Math.min(min1, a[i]);min2=Math.min(min2, b[i]);
			}
			for(int i=0; i<n; i++) count+=Math.max(a[i]-min1, b[i]-min2);
			System.out.println(count);
			
		}

	}
//	public static void main(String[] args)throws java.lang.Exception {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			int n=Integer.parseInt(br.readLine());
//			StringTokenizer s1 = new StringTokenizer(br.readLine());
//			StringTokenizer s2 = new StringTokenizer(br.readLine());
//			long a[]=new long[n],b[]=new long[n],min1=Long.MAX_VALUE,min2=Long.MAX_VALUE,count=0;
//			for(int i=0; i<n; i++) {
//				a[i]=Long.parseLong(s1.nextToken());b[i]=Long.parseLong(s2.nextToken());
//				min1=Math.min(min1, a[i]);min2=Math.min(min2, b[i]);
//			}
//			for(int i=0; i<n; i++) {
//				if(a[i]>min1 && b[i]>min2) {
//					long m1=a[i]-min1,m2=b[i]-min2,c=Math.max(m1, m2);
//					count+=c;
//				}else {
//					if(a[i]>min1) count+=a[i]-min1;
//					else count+=b[i]-min2;
//				}
//			}
//			System.out.println(count);
//			
//		}
//
//	}

}
