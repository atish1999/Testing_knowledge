package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Kefa_and_First_Steps {
	  public static void main(String[]args) throws java.lang.Exception
	    {	
		  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n =Integer.parseInt(br.readLine()),a[] = new int[n];
			int c=1,ans=1;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(st.nextToken());
				if(i>0) {
					if(a[i]>=a[i-1]) {
						++c;
						ans=Math.max(ans, c);
					}else c=1;
				}
			}
			System.out.println(ans);
	    }
//	public static void main(String[] args)throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine()), x=0, a[] = new int[n], c=0,o=0;
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		while(x<n) {a[x] = Integer.parseInt(st.nextToken());++x;}
//		for(int i=0; i<n-1; i++) {
//			if(a[i]<=a[i+1]) ++c;
//			else o=Math.max(o, c+1); c=0;
////			System.out.println(o+" "+c);
//		}
//		o=Math.max(o, c+1);
//		System.out.println(o);
//    }

}
