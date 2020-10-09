package code_forces.Div2B.Level800_900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Honest_Coach {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++)a[i]=Integer.parseInt(s1.nextToken());
			int ans=Integer.MAX_VALUE;Arrays.sort(a);
			for(int i=1; i<n; i++) ans=Math.min(ans, a[i]-a[i-1]);
			System.out.println(ans);
		}

	}

}
