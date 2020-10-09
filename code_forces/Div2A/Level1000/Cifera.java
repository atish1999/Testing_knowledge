package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Cifera {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(br.readLine()),l=Integer.parseInt(br.readLine()),c=-1;
		while(l%k==0) {
			l/=k;++c;
		}
		System.out.println(c>=0 && l==1 ?"YES\n"+c:"NO");
	}

}
