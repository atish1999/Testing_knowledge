package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Most_Unstable_Array {

//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			long n = Long.parseLong(st.nextToken()),m = Long.parseLong(st.nextToken());
//			System.out.println(n==1?0:n==2?m:2*m);
//		}
//
//	}
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n = Long.parseLong(st.nextToken()),m = Long.parseLong(st.nextToken());
			System.out.println(n==1?0:Math.min(2, n-1)*m);//when n=2 min=(n-1) i.e. 2-1=1
			// other wise for any bigger n min = 2.
		}

	}

}
