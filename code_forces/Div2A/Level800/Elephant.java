package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Elephant {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()),c=n/5;
		if(n%5==0) System.out.println(c);
		if(n%5==1||n%5==2||n%5==3||n%5==4) 
			System.out.println(++c);	
	}

}
