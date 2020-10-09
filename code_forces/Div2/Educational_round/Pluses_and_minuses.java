package code_forces.Div2.Educational_round;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Pluses_and_minuses {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			String s=br.readLine();
			int c1=0,c2=0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='+') ++c2;
				else ++c1;
			}
		}

	}

}
