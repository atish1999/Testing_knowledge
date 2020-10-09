package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Weird_substraction {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a =Long.parseLong(st.nextToken()), b =Long.parseLong(st.nextToken());
		while(true) {
			if(a==0 || b==0) break;
			else if(a>=2*b) a%=2*b;
			else if(b>=2*a) b%=2*a;
			else break;
		}
		System.out.println(a+" "+b);
	}

}
