package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Minimal_Square {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(s1.nextToken()),b=Integer.parseInt(s1.nextToken()),
			c=Math.min(a, b),d=Math.max(a, b);
			System.out.println(2*c>=d?4*c*c:d*d);
		}

	}

}
