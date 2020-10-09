package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class HQ9p {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String p= br.readLine();
		boolean f=false;
		for(int i=0; i<p.length(); i++) {
			if(p.charAt(i)=='H'||p.charAt(i)=='Q'||p.charAt(i)=='9') 
			{ f=true;break;}		
		}
		System.out.println(f?"YES":"NO");
		
	}

}
