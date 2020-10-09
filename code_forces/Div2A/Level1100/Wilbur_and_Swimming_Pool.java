package code_forces.Div2A.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Wilbur_and_Swimming_Pool {

	public static void main(String[] args) throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),x[]=new int[n],y[]=new  int[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i]=Integer.parseInt(st.nextToken());y[i]=Integer.parseInt(st.nextToken());
		}
		if(n==1) System.out.println(-1);
		else {
			int l=0,b=0;
			for(int i=1; i<n; i++) {
				if((x[i]-x[i-1])!=0) {l=(int)Math.abs(x[i]-x[i-1]);break;}
			}
			for(int i=1; i<n; i++) {
				if((y[i]-y[i-1])!=0) {b=(int)Math.abs(y[i]-y[i-1]);break;}
			}
			System.out.println(l==0||b==0?-1:l*b);
		}
	}

}
