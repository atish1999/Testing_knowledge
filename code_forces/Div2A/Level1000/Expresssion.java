package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Expresssion {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(br.readLine()), b=Integer.parseInt(br.readLine()),
		 c=Integer.parseInt(br.readLine());
		int p1=a*b*c,p2=a+b+c,p3=Math.max((a+b)*c, (b+c)*a);
		System.out.println(max(p1,p2,p3));
	}
	static int max(int a, int b , int c) {
		return a>b && a>c? a: b>a && b>c ? b: c;
	}

}
