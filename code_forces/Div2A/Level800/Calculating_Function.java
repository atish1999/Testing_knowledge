package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Calculating_Function {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n=Long.parseLong(br.readLine());
		System.out.println((n&1)==0?n/2:-(n/2+1));
	}

}
