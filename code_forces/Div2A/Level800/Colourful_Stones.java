package code_forces.Div2A.Level800;

import java.io.*;

public class Colourful_Stones {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(),t=br.readLine();int p=0;
			for(int i=0; i<t.length(); i++) {
				if(s.charAt(p)==t.charAt(i)) ++p;
			}
		System.out.println(++p);
	}

}
