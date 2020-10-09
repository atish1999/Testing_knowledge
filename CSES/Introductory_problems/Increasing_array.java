package CSES.Introductory_problems;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Increasing_array {

	public static void main(String[] args) throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		long a[]=new long[n],c=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Long.parseLong(st.nextToken());
			if(i>0 && a[i]<a[i-1]) {
				c+=a[i-1]-a[i];
				a[i]=a[i-1];
			}
		}
		System.out.println(c);
	}

}
