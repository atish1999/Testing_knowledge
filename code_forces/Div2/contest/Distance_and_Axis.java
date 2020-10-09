package code_forces.Div2.contest;
import java.util.*;
import java.io.*;
public class Distance_and_Axis {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken());
			if(n>=k) {
				if(((n&1)==0 && (k&1)==0) || ((n&1)==1 && (k&1)==1)) System.out.println(0);
				else System.out.println(1);
			}else {
				System.out.println(k-n);
			}
		}
	}

}
