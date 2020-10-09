package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Dreamoon_and_stairs {
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		int min=0;
		if(n%2==0) min=n/2;
		else min=n/2+1;
		int ans=-1;
		for(int i=min; i<=n; i++) {
			if(i%m==0) { ans=i; break;}
		}
		System.out.println(ans);
    }
}
