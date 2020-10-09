package Atcoder.Beginner_Contest.B;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Crane_and_turtle {
	

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x =Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
/*

The necessary and sufficient conditions for the answer to be Yes is that Y is an even number between
2X and 4X, inclusive.
Proof of necessity: if the statement is true for a cranes and b turtles, then Y = 2a + 4b = 2(a + 2b),
and since a, b is an integer, Y must be an even number. Also, since a + b = X, 2a + 4b = Y, we obtain
a = (4X − Y)/2, b = (Y − 2X)/2, and since a, b are non-negative, Y should be between 2X and 4X,
inclusive. Here the proof ends.
Proof of sufficiency: if Y is an even number between 2X and 4X, inclusive, then (4X − Y)/2, (Y −
2X)/2 are both a non-negative integer, so there exists a combination of numbers of cranes and turtles:
“(4X − Y)/2 cranes and (Y − 2X)/2 turtles.” Here the proof ends
*/
		System.out.println(y%2==0 && y>=2*x && y<=4*x? "Yes":"No" );
	}

	static void solve() throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x =Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
		boolean f=false;
		for(int i=0; i<=x; i++) {
			if((i*2+ (x-i)*4)==y) 
			  {f=true; break;}
		}
		System.out.println(f?"Yes":"No");
    }

}
