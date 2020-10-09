package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Minimum_difficulty {

	public static void main(String[] args)  throws java.lang.Exception
    {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()),x=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a[]=new int[n];
		while(x<n) {a[x]=Integer.parseInt(st.nextToken());++x;}
		int min=Integer.MAX_VALUE;
		for(int i=0; i<n-2; i++) {
			int j=1,max=-1;
			while(j<n) {
				int d=0;
				if(j==i+1) {
					max=Math.max(max, a[j+1]-a[j-1]);
					j+=2;
				}else {
					max=Math.max(max, a[j]-a[j-1]);
					++j;
				}
			}
			min=Math.min(min, max);
		}
		System.out.println(min);
    }

}
