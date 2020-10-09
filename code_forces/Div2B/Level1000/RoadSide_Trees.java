package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class RoadSide_Trees {
	
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine()),a=Integer.parseInt(br.readLine()),
		sum=t+a+t-1;
		for(int i=1; i<t; i++) {
			int b=a;
			a=Integer.parseInt(br.readLine());
			sum+=Math.abs(a-b);
		}
		System.out.println(sum);
	}

//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine()),h[]=new int[t];
//		for(int i=0;i<t; i++) {
//			h[i]=Integer.parseInt(br.readLine());
//		}
//		int sum=t+t-1+h[0];//t=total no. of times it will eat nut
//		// t-1=total no. of times it will jump.
//		//h[0]=time required to climb upon the first tree.
//		for(int i=0; i<t-1; i++) {
//			sum+=Math.abs(h[i+1]-h[i]);
//		}
//		System.out.println(sum);
//	}

}
