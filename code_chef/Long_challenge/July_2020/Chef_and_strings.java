package code_chef.Long_challenge.July_2020;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Chef_and_strings {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n =Integer.parseInt(br.readLine());
			long a[]=new long[n],s=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Long.parseLong(st.nextToken());
			for(int i=0; i<n-1; i++) {
				if(a[i+1]>a[i]) s+=a[i+1]-(a[i]+1);
				else s+=a[i]-(a[i+1]+1);	
			}
			System.out.println(s);
		}

	}

}
