package code_forces.Div2C.Level1200;
import java.util.*;
import java.io.*;
public class Birthday {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
		Arrays.sort(a);
		for(int i=0; i<n; i+=2) System.out.print(a[i]+" ");
		int i=(n&1)==1?n-2:n-1;
		while(i>=0) {
			System.out.print(a[i]+" ");
			i-=2;
		}
	}

}
