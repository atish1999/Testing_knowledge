package code_forces.Div2A.Level800;

import java.io.*;
import java.util.*;

public class Reconn2 {

	public static void main(String[] args) throws java.lang.Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n =Integer.parseInt(br.readLine());
	        int a[]=new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++){
			    a[i]=Integer.parseInt(st.nextToken());
			}
			int p1=1,p2=n;
			int min=Math.abs(a[0]-a[n-1]);
			for(int i=0; i<n-1; i++){
			   if(Math.abs(a[i+1]-a[i])<min){
			    	min=Math.abs(a[i]-a[i-1]);
			        p1=i+1;p2=i;
			    }
			}
			System.out.println((p2)+" "+(p1));

	}

}
