package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Yet_Another_Array_Restoration {

	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
			int j=n-1,d=1;
			while(true) {
				if((y-x)%j==0 && ((y-x)/j)+1<n) {
					d=(y-x)/j;
					break;
				}
				--j;
			
			}
			int a0=x-Math.min(y-1/j, n-1);
			for(int i=0; i<n; i++) {
				System.out.print(a0+i*d+" ");
			}
			System.out.println();
		}
	}

}
