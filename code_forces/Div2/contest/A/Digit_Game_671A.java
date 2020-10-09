package code_forces.Div2.contest.A;
import java.util.*;
import java.io.*;

public class Digit_Game_671A {

	static int mod = (int) (1e9 + 7);
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());//n=number of digits
			String s=br.readLine();
			int c1=0,c2=0;
			for (int i = 0; i < n; i++) {
//		we are calculating that in even position how many even numbers are there
//		and in odd positions how many odd numbers are there....
				if(((i+1)&1)==0 && (s.charAt(i)&1)==0) ++c2;
				if(((i+1)&1)==1 && (s.charAt(i)&1)==1) ++c1;
			}
//		if(n is odd) then last remaining position would be for odd
//		so if there is atleast 1 odd in odd position then R will win otherwise B 
//		and in case of even last remaining position would be for even
//		so if there is atleast 1 even in even position then B will win otherwise R 	
			if((n&1)==1) {
				System.out.println(c1!=0? 1 : 2);
			}else {
				System.out.println(c2!=0? 2 : 1);
			}
		}
	}
}