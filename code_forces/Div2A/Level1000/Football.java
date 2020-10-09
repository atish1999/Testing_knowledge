package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Football {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine()),p1=1,p2=0;
		String s =br.readLine(),b="";
		for(int i=0; i<n-1; i++) {
			String s1= br.readLine();
			if(s1.equals(s)) ++p1;
			else {++p2;b=s1;}
		}
		System.out.println(p1>p2? s:b);
	}
}
