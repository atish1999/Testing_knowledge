package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Number_Game {

	static boolean prime(int n) {
		if(n<=1) return false;
		else if(n<=3) return true;
		else if(n%2==0 || n%3==0) return false;
		else {
			for(int i=5; i*i<=n; i+=6)
				if(n%i==0 || n%(i+2)==0) return false;
		}
		return true;
	}
	public static void main(String[] args)throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			if((n&1)==1) System.out.println(n==1?"FastestFinger":"Ashishgup");
			else {
				if(n==2) System.out.println("Ashishgup");//when n==2
				else {
					 // n is of the form 2^x but n!=2
					if((n&(n-1))==0) System.out.println("FastestFinger");
					// if n%4==0 i.e. we can divide the number with its largest odd factor
					else if(n%4==0) System.out.println("Ashishgup");
					// other wise n will be of 2*p(where p is odd)
					//if p is prime then F will win other wise A will win
					//(because p will be p1*p2 {where p1 will be prime & p2 will be any odd no.>1}
					else System.out.println(n%4!=0 && prime(n/2)?"FastestFinger":"Ashishgup");
				}
			}
		}
	}

}
