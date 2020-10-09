package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Lunch_Rush {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
		int max=0,ans=-1000000000;
		while(n-->0) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int f =Integer.parseInt(s.nextToken()),t=Integer.parseInt(s.nextToken());
			if(t>k) max=f-t+k; //for each value of t calculate local maximum								//			
			else max=f;//and the answer would be the global maximum ,i.e. the maximum of  all these local max
			if(ans<max) ans=max;
		}
		System.out.println(ans);
	}
//	public static void main(String[] args) throws java.lang.Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n =Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
//		int a[][]=new int[n][2];
//		for(int i=0; i<n; i++) {
//			StringTokenizer s = new StringTokenizer(br.readLine());
//			for(int j=0; j<2; j++) {
//				a[i][j]=Integer.parseInt(s.nextToken());
//			}
//		}
//		int  max=0,ans =-1000000000;
//		for(int i=0; i<n; i++) {
//			if(a[i][1]>k) max=a[i][0]-a[i][1]+k;
//			else max = a[i][0];
//			if(max>ans) ans =max;
//		}
//		System.out.println(ans);
//	}
}
