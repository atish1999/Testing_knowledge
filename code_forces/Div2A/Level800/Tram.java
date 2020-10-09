package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Tram {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),ans=0,count=0;
		while(n-->0) {
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(s1.nextToken()),b=Integer.parseInt(s1.nextToken());
			ans-=a;ans+=b;
			count=Math.max(count, ans);
		}
		System.out.println(count);
	}

}
