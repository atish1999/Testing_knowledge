package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Watching_A_movie {
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
		int current=1,extra=0,best=0;
		while(n-->0) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int l =Integer.parseInt(s.nextToken()),r=Integer.parseInt(s.nextToken());
			extra+=(l-current)%x;
			best+=(r-l)+1;
			current=r+1;
		}
		System.out.println(best+extra);
    }

//	public static void main(String[] args)throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n =Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
//		int a[][] =new int[n][2];
//		for(int i=0; i<n; i++) {
//			StringTokenizer s = new StringTokenizer(br.readLine());
//			a[i][0]=Integer.parseInt(s.nextToken());a[i][1]=Integer.parseInt(s.nextToken());
//		}
//		int c=1,t=0;
//		for(int i=0; i<n; i++) {
//			while (c+x <= a[i][0]) c+=x;//need multiple times checking whether 
//			System.out.print(c+" ");//c+x less than or equal to a[i][0] or not
//			t+=(a[i][1]-c)+1;// if we use if instead of while then there will be 
//			c=a[i][1]+1;     // one time checking....
//			System.out.print(c+" ");
//		}
//		System.out.println(t);
//	    
//	}

}
