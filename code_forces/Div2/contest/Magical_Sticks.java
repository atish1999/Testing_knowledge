package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Magical_Sticks {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n =Integer.parseInt(br.readLine());
			System.out.println(n==1||n==2? 1:(n-1)/2+1);
		}

	}

}
