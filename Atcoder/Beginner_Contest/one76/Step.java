package Atcoder.Beginner_Contest.one76;
import java.util.*;
import java.io.*;
public class Step {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine()),a[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
		long sum=0;
		for(int i=1; i<n; i++) {
			if(a[i]<a[i-1]) {
				sum+=(a[i-1]-a[i]);
				a[i]=a[i-1];
			}
		}
		System.out.println(sum);
	}
}
