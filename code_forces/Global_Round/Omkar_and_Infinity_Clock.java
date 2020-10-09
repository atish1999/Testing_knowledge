package code_forces.Global_Round;
import java.util.*;
import java.io.*;
public class Omkar_and_Infinity_Clock {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0){
			StringTokenizer s = new StringTokenizer(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(s.nextToken());long k=Long.parseLong(s.nextToken());
			long a[]=new long[n];
			long max=Long.MIN_VALUE,max1=Long.MIN_VALUE;
			for(int i=0; i<n; i++) {
				a[i]=Long.parseLong(st.nextToken());
				max=Math.max(max, a[i]);
			}
			long A1[]=new long[n],A2[]=new long[n];
			for(int i=0; i<n; i++) {
				A1[i]=max-a[i];
				max1=Math.max(max1, A1[i]);
			}
			for(int i=0; i<n; i++) A2[i]=max1-A1[i];
			if((k&1)==1) {
				for(long e: A1) System.out.print(e+" ");
				System.out.println();
			}else {
				for(long e: A2) System.out.print(e+" ");
				System.out.println();
			}
			
		}
	}

}
