package code_forces.Div2B.Level1700;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Nearest_Fraction {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x=Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken()),n=Integer.parseInt(st.nextToken());
		float f=(x/y),ans=Float.MIN_VALUE;
		int a=1,b=1;
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if (ans>=Math.abs((float)(i)/(float)(j))){
					ans=Math.abs((float)(i)/(float)(j));
					a=i;b=j;
				}
			}
//			System.out.println(ans+" "+a+"/"+b);
		}
		System.out.println(a+"/"+b);
	}
	

}
