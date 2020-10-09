package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Short_Substrings {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			String b = br.readLine();
			for(int i=0; i<b.length(); i+=2) {
				System.out.print(b.charAt(i));
			}
			System.out.print(b.charAt(b.length()-1));
			System.out.println();
		}

	}

}
