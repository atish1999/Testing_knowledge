package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Bear_and_Raspberry {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken()),x=0,
		a[]=new int[n],max=0;
		StringTokenizer s = new StringTokenizer(br.readLine());
		while(x<n) { a[x]=Integer.parseInt(s.nextToken());++x;}
		for(int i=0; i<n-1; i++) {
			max=Math.max(max, a[i]-a[i+1]-c);
		}
		System.out.println(max);
	}

}
