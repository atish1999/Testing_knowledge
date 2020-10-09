package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Boats_Competition {

	public static void main(String[] args) throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
			int f[]=new int[101];//maximum pair sum can be 100;
			Arrays.sort(a);
			// for each i of f(i.e. for each sum count the pairs with the help of array(a[]) elements)
			for(int i=0; i<f.length; ++i)  f[i]=countPair(a,i);
			int max=0;
			//element with maximum frequency will be the answer
			for(int e: f) max=Math.max(max, e);
			System.out.println(max);
		}
	}
	static int countPair(int[]a, int sum) {
		int c=0,i=0,j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]==sum) {++c;++i;--j;}
			else if(a[i]+a[j]<sum) ++i;
			else --j;
		}
		return c;
	}

}
