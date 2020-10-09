package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Anton_and_Danik {

	public static void main(String[] args) throws java.lang.Exception{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a=0,d=0;
		String s=br.readLine();
		while(n-->0) {
			if(s.charAt(n)=='A') ++a;
			else ++d;
		}
		System.out.println(a>d?"Anton":a==d?"Friendship":"Danik");
	}

}
