package code_forces.Div2A.Level800;

import java.io.*;
import java.util.*;
import java.lang.*;
public class Eugeny_and_Array {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
        int a[]=new int[n],
		  c1=0,c2=0;
    	StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(s.nextToken());
			if(a[i]==1) ++c1;
			if(a[i]==-1) ++c2;
		}
		while(m-->0) {
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			int l=Integer.parseInt(s1.nextToken()),r=Integer.parseInt(s1.nextToken())
					,len=r-l+1;
			System.out.println(len%2==0 && c1>=len/2 && c2>=len/2 ? 1: 0);
		}
		
	}	

}
