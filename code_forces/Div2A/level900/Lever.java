package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Lever {

	public static void main(String[] args) throws java.lang.Exception
    {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();int i=-1;long l=0,r=0;
		int m=s.indexOf('^');
		for(int j=0; j<m; j++) {
			if(s.charAt(j)!='=') l+=(s.charAt(j)-48)*(m-j);
		}
		for(int j=s.length()-1; j>m; j--) {
			if(s.charAt(j)!='=') r+=(s.charAt(j)-48)*(j-m);
		}
		if(l==r) System.out.println("balance");
		else System.out.println(l>r?"left":"right");
		
	}

}
