package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Most_socially_distanced_subsequence {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			double a[]=new double[n],d=0;
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Double.parseDouble(st.nextToken());
			Arrays.sort(a);
			for(int i=1; i<n; i++) {
				d=Math.max(d, (a[i]-a[i-1])/2);
			}
			System.out.println(d);
		}
	}

}
