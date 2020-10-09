package CSES.Introductory_problems;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Weird_Algorithm {

	public static void main(String[] args) throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		if(n==1) System.out.println(1);
		else {
			System.out.print(n+" ");
			do {
				if((n&1)==0) {
					System.out.print(n/2+" ");n/=2;
				}
				else {
					System.out.print((n*3+1)+" ");n=n*3+1;
				}
			}while(n!=1);
		}
	}

}
