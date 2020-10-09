package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Vanya_and_Lanterns {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),l=Integer.parseInt(st.nextToken()); 
		double a[]=new double[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Double.parseDouble(st.nextToken());
		Arrays.sort(a);
		double d=(a[0]-0);
		for(int i=1; i<n; i++) {
			d=Math.max(d, (a[i]-a[i-1])/2);
		}
		d=Math.max(d, (l-a[n-1]));
		System.out.printf("%.10f\n", d);
	}

}
