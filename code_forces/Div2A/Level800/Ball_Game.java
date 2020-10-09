package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ball_Game {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),cur=1;
		for(int i=1; i<n; i++) {
			cur=(i+cur)%n;
			if(cur==0) cur=n;
			System.out.print(cur+" ");
		}
	}
//	public static void main(String[] args) throws java.lang.Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n=Integer.parseInt(br.readLine());
//		int c=2;
//		for(int i=0; i<n-1; i++) {
//			if(i==0) System.out.print(c+" ");
//			else {
//				if(c+i+1<=n) c+=i+1;
//				else c=c+i+1-n;
//				System.out.print(c+" ");
//			}
//		}
//	}

}
