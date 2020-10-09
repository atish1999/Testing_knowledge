package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Permutation_Forgery {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[n-i-1]=Integer.parseInt(st.nextToken());
			for(int x: a) System.out.print(x+" ");
			System.out.println();
		}
	}

}
