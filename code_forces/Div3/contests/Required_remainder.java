package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Required_remainder {
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t =Long.parseLong(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long x=Long.parseLong(st.nextToken()),y=Long.parseLong(st.nextToken()),
			n=Long.parseLong(st.nextToken()),a=n%x;
			System.out.println(a-y>=0?n-a+y:n-a-x+y);	    
		}
	
	}

//	public static void main(String[] args)throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		long t =Long.parseLong(br.readLine());
//		while(t-->0) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			long x=Long.parseLong(st.nextToken()),y=Long.parseLong(st.nextToken()),
//			n=Long.parseLong(st.nextToken());
//			System.out.println((x*((n-y)/x)) + y);     
//		}
//	
//	}

}
