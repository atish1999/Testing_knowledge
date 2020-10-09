package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Puzzles {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		StringTokenizer s = new StringTokenizer(br.readLine());
		int a[]= new int[m],max=a[0],min=a[0];
		for(int i=0; i<m; i++) {
			a[i]=Integer.parseInt(s.nextToken());
		}
		// we have to find for the local minimum sets
		// so that we can find the global minimum among them.
		Arrays.sort(a);int d=Integer.MAX_VALUE; 
		for(int i=0; i<=m-n; i++) {
			d=Math.min(d, a[i+n-1]-a[i]); //if(d>a[i+n-1]-a[i]) d=a[i+n-1]-a[i];
			//Both are same			
		}
		System.out.println(d);
		
	}

}
