package code_forces.Div2.contest;
import java.util.*;
import java.io.*;
public class Power_Sequence {

	static int mod=(int) (1e9+7);
	public static void main(String[] args) throws java.lang.Exception  
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long a[]=new long[n];
        StringTokenizer s = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) a[i]=Long.parseLong(s.nextToken());
        Arrays.sort(a);
        long cost=0,min=(long)Math.ceil(Math.sqrt(a[1])),c=1;
        for(int i=0; i<n; i++) {
        	cost+=Math.abs(a[i]-c);
        	c=c*min;
        }
        System.out.println(cost);
	}

}
