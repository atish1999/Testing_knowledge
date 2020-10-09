package code_chef.coders_legacy;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Chef_vs_Doof {
	
	public static void main(String[] args) throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
			boolean f=true;
			for(int i=0; i<n; i++) {
				if((a[i]&1)==0) {f=false;break;}
			}
			System.out.println(f?"YES":"NO");
		}
	}

	

}
