package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Captain_Flint_and_a_Long_Voyage {
	public static void main(String[] args) throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			int x=(int)Math.ceil(n/4.0);//ceil function returns the least value of the integer that is greater than or equal to the specified number.
			System.out.println("9".repeat(n-x)+"8".repeat(x));
		}
	}

//	public static void main(String[] args) throws java.lang.Exception {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			int n=Integer.parseInt(br.readLine());
//			if(n%4!=0) {
//				System.out.println("9".repeat(n-((n/4)+1))+"8".repeat((n/4)+1));
//			}else {
//				System.out.println("9".repeat(n-n/4)+"8".repeat(n/4));
//			}
//		}
//	}

}
