package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Boboniu_Plays_Chess {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),
		x=Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
		rep1(x,m);rep1(1, x);
	}
	static void rep1(int a, int b) {
		for(int i=a; i<=b; ++i) System.out.println(a+" "+i);
	}
}
