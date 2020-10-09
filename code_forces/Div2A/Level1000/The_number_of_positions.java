package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;

public class The_number_of_positions {
	
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),a=Integer.parseInt(st.nextToken()),
		b=Integer.parseInt(st.nextToken());
		System.out.println(Math.min(n-a, b+1));
    }

//	public static void main(String[] args)throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n =Integer.parseInt(st.nextToken()),a=Integer.parseInt(st.nextToken()),
//		b=Integer.parseInt(st.nextToken());
//		while(n-a-1>b) a+=1;
//		System.out.println(n-a);
//		
//	}

}
