package code_forces.Global_Round;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Sign_flipping {
	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			long a[]=new long[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Long.parseLong(st.nextToken());
			if(a[n-1]<0) a[n-1]=-a[n-1];
			for(int i=0; i<n-1; i+=2) {
				if(a[i]<0) 
					a[i]=-a[i];
				if(a[i+1]>0) a[i+1]=-a[i+1];
			}
			/*if in alternate positions there are '+' and '-' then
			 instructions would be followed.because we need atleast both (n-1)/2
			 positive and negative differences */
			for(long e: a) System.out.print(e+" ");
			System.out.println();
		}
	}

//	public static void main(String[] args) throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			int n=Integer.parseInt(br.readLine());
//			long a[]=new long[n];
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			for(int i=0; i<n; i++) a[i]=Long.parseLong(st.nextToken());
//			if(a[n-1]>0) a[n-1]=-a[n-1];
//			for(int i=0; i<n-1; i+=2) {
//				if(a[i]>0) 
//					a[i]=-a[i];
//				if(a[i+1]<0) a[i+1]=-a[i+1];
//			}
//			for(long e: a) System.out.print(e+" ");
//			System.out.println();
//		}
//	}

}
