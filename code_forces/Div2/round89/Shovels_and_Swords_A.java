package code_forces.Div2.round89;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Shovels_and_Swords_A {

	public static void main(String[] args) throws java.lang.Exception    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a =Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),n=0;
			if(2*a<=b) n=a;
			else if(2*b<=a) n=b;
			else n=(a+b)/3;
			System.out.println(n);			
		}
	}
}
