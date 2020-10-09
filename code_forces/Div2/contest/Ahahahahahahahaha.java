package code_forces.Div2.contest;
import java.util.*;
import java.io.*;
public class Ahahahahahahahaha {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer s = new StringTokenizer(br.readLine());
			int c=0,c1=0;
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(s.nextToken());
				if(a[i]==0) ++c;
				else ++c1;
			}
			if(c>=n/2) {
				System.out.println(c+"\n"+"0 ".repeat(c));
			}else {
				if((c1&1)==1) --c1;
				System.out.println(c1+"\n"+"1 ".repeat(c1));
			}
		}
	}
	
}
