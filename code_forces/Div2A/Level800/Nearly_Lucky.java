package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Nearly_Lucky {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();int c=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='7'||s.charAt(i)=='4') ++c;
		}
		System.out.println(c==7||c==4?"YES":"NO");
	}

}
