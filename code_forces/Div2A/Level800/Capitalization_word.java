package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Capitalization_word {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char s[]=br.readLine().toCharArray();
		s[0]=Character.toUpperCase(s[0]);
		System.out.println(s);
	}

}
