package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Vasya_Calendar {
	public static void main(String[] args) throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int d=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine()),
			a[]=new int[n],c=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<n-1; i++) c+=d-a[i];
		System.out.println(c);
	}
//	public static void main(String[] args) throws java.lang.Exception
//	{		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int d=Integer.parseInt(br.readLine());
//		int n=Integer.parseInt(br.readLine()),
//			a[]=new int[n],c=0;
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i=0; i<n; i++) {
//			a[i]=Integer.parseInt(st.nextToken());
//			if(i<n-1) c+=d-a[i];
//		}
//		System.out.println(c);
//	}

}
