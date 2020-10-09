package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Minimum_Product {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			long a=Long.parseLong(st.nextToken()),b=Long.parseLong(st.nextToken()),
			x=Long.parseLong(st.nextToken()),y=Long.parseLong(st.nextToken()),
		    n=Long.parseLong(st.nextToken());
			long ans=Math.min(calc(a,b,x,y,n),calc(b,a,y,x,n));
			System.out.println(ans);
		}

	}
	static long calc(long a, long b, long x, long y,long n) {
		long d=Math.min(b-y, n);
		b-=d;
		n-=d;
		a=a-Math.min(a-x, n);
		return a*b;
	}
	

}
