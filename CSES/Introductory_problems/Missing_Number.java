package CSES.Introductory_problems;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Missing_Number {

	public static void main(String[] args)throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine()),a[]=new int[n-1],f[]=new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n-1; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			++f[a[i]];
		}
		for(int i=1; i<=n; ++i) {
			if(f[i]==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
