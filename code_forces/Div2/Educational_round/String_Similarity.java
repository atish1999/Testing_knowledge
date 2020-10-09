package code_forces.Div2.Educational_round;
import java.util.*;
import java.io.*;
public class String_Similarity {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			String s=br.readLine();
			int c=0,c1=0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='0') ++c;
				else ++c1;
			}
			System.out.println(c>c1?"0".repeat(n):"1".repeat(n));
		}
	}

}
