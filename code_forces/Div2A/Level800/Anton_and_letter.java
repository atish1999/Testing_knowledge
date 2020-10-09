package code_forces.Div2A.Level800;

import java.io.*;

public class Anton_and_letter {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int c=0;
		String n="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<n.length();i++) {
			for(int j=0; j<s.length(); j++){	
				if(n.charAt(i)==s.charAt(j)) {
					++c;
					break;
				}
			}
		}
		System.out.println(c);
		

	}

}
