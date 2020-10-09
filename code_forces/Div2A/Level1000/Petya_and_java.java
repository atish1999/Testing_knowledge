package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Petya_and_java {

	public static void main(String[] args)  throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			long n=Long.parseLong(br.readLine());
			if(n<=Byte.MAX_VALUE) System.out.println("byte");
			else if(n<=Short.MAX_VALUE) System.out.println("short");
			else if(n<=Integer.MAX_VALUE) System.out.println("int");
			else System.out.println("long");	
		}catch(Exception e) {
			System.out.println("BigInteger");
		}
	}

}
