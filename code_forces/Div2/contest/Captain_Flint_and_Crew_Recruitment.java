package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Captain_Flint_and_Crew_Recruitment {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			if(n<=30) System.out.println("NO");
			else {
				if(n==36) System.out.println("YES\n"+"6"+" "+"10"+" "+"15"+" "+"5");
				else if(n==40) System.out.println("YES\n"+"6"+" "+"10"+" "+"15"+" "+"9");
				else if(n==44) System.out.println("YES\n"+"6"+" "+"10"+" "+"21"+" "+"7");
				else System.out.println("YES\n"+"6"+" "+"10"+" "+"14"+" "+(n-30));
			}
		}

	}

}
