package code_forces.Div2A.Level800;

import java.io.*;

public class Bit_pp {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),p=0;
		while(n-->0) {
			String s = br.readLine();
			if(s.charAt(0)=='+') ++p;
			else if(s.charAt(0)=='-') --p;
			else if(s.charAt(0)=='X' && s.charAt(1)=='+') p++;
			else if(s.charAt(0)=='X' && s.charAt(1)=='-') p--;
		}
		System.out.println(p);
	}

}
