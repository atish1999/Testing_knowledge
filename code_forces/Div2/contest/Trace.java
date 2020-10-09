package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Trace {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(a);
		int A=0;
		for(int i=n-1; i>=0; i-=2) A+=(a[i]*a[i]);
		for(int i=n-2; i>=0; i-=2) A-=(a[i]*a[i]);	
		System.out.printf("%.10f\n" ,Math.PI*A);
	}

}
