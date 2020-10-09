package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Young_PhotoGrapher {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), x=Integer.parseInt(st.nextToken()),
			m=Integer.MIN_VALUE,M=Integer.MAX_VALUE;
		while(n-->0) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(s.nextToken()), b=Integer.parseInt(s.nextToken());
			if(a>b) {a^=b;b^=a;a^=b;}
			m=Math.max(m, a);M=Math.min(M, b);
		}
		// denote by m the rightmost of left ends of the segments
		//and denote by M the leftmost of right ends of the segments. 
		//The intersection of the segments is [m,M] (or empty set if m>M).
		//Now determine the nearest point from this segment. 
		//If x 0 < m , it's m , and the answer is m - x 0 .
		//If x 0 > M , it's M , and the answer is x 0 - M .
		//If  , it's x 0 , and the answer is 0. 
		//If m>M, then the answer is -1. 
		if(m>M) System.out.println(-1);
		else System.out.println(x<m?m-x:x>M?x-M:0);	
	}

}
