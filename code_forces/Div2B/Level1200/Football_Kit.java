package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Football_Kit {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int cnt[]=new int[(int)(1e5+1)],y[]=new int[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());y[i]=Integer.parseInt(st.nextToken());
			++cnt[x];
		}
// each team will be wearing atleast (n-1)times home jersey and  atmost (n-1)times away jersey
		for(int i=0; i<n; i++) {
			System.out.println(((n-1)+cnt[y[i]])+" "+((n-1)-cnt[y[i]]));
		}
	}
	//O(n^2) { as n<=1e5 thats why we will be getting TLE...}
	static void solve(int x[], int y[]) {
		int n=x.length;
		int c[][]=new int[n][2];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i!=j) {
					if(x[i]!=y[j]) {++c[i][0];++c[j][1];}
					else {++c[j][0];++c[i][0];}
				}
			}
		}
		for(int []e: c) {
			for(int i: e) System.out.print(i+" ");
			System.out.println();
		}
	}

}
