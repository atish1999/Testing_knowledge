package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Line_to_cashier {

	public static void main(String[] args) throws java.lang.Exception
    {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		int t=Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int sum=0;
			for(int j=0; j<a[i]; j++) {
				sum+=Integer.parseInt(s.nextToken());
			}
			int c=(sum*5)+(a[i]*15);
			t=Math.min(t, c);
		}
		System.out.println(t);
	}

}
