package code_forces.Div2.Educational_round;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Donut_shop {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a =Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),
					c=Integer.parseInt(st.nextToken());
			if(a>=c) System.out.println(-1+" "+b);
			else {
				System.out.println(1+" ");
				System.out.print(a<=c/b?"-1\n":b+"\n");
			}
		}
    }
}

