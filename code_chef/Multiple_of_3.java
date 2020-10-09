package code_chef;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Multiple_of_3 {
	public static void main(String[] args)throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long l = Long.parseLong(st.nextToken()),a= Long.parseLong(st.nextToken()),
					b=Long.parseLong(st.nextToken()),sum=a+b;
			
		}

	}

	/*
	 * we will be getting TLE if we go through with this approach
	 * public static void main(String[] args)throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long l = Long.parseLong(st.nextToken()),a= Long.parseLong(st.nextToken()),
					b=Long.parseLong(st.nextToken()),sum=a+b;
			for(long i=2; i<l; i++) {
				long c=sum%10;
				sum+=c;
			}
			System.out.println(sum%3==0?"YES":"NO");
		}

	}*/

}
