package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Suborrays {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			for(int i=n; i>=1; i--) System.out.print(i+" ");
			System.out.println();
		}
	}

}
