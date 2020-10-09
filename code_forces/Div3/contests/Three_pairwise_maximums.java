package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Three_pairwise_maximums {

	public static void main(String[] args)  throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken()),z=Integer.parseInt(st.nextToken());
			if(x==y) {
				if(z<=x) System.out.println("YES\n"+x+" "+z+" "+z);
				else System.out.println("NO");
			}else if(x==z) {
				if(y<=x) System.out.println("YES\n"+y+" "+x+" "+y);
				else System.out.println("NO");
			}else if(y==z) {
				if(x<=y) System.out.println("YES\n"+x+" "+x+" "+y);
				else System.out.println("NO");
			}else System.out.println("NO");
		}

	}

}
