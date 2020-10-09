package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ternary_Sequence {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			StringTokenizer s=new StringTokenizer(br.readLine());
			long x1=Long.parseLong(st.nextToken()),y1=Long.parseLong(st.nextToken()),z1=Long.parseLong(st.nextToken())
		   ,x2=Long.parseLong(s.nextToken()),y2=Long.parseLong(s.nextToken()),z2=Long.parseLong(s.nextToken());
			long x=Math.min(z1, y2);
			z1-=x; y2-=x;
//			method-1
//			if(x1==(y2+z2) && x2==(y1+z1)) System.out.println(2*x);
//			else {
//				z2-=Math.min(z2, z1);
//				z2-=Math.min(z2, x1);
//				System.out.println((2*x)-(2*z2));
//			}
			//method-2
			long ans=2*x;
			z2-=(z1+x1);
			if(z2>0) ans-=2*z2;
			System.out.println(ans);
		}
	}

}
