package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class The_Fibonacci_Segment {

	public static void main(String[] args)throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
		if(n==1) System.out.println(1);
		else{
			int max=0,len=0;
			for(int i=2; i<n; ++i) {
				if(a[i]==(a[i-2]+a[i-1])) {
					++len;
					max=Math.max(max, len);
				}else len=0;
			}
			System.out.println(max==0?2:max+2);
		}
	}

}
