package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class George_and_Round {
	
	static int n,m;
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());m=Integer.parseInt(st.nextToken());
		int a[]=new int[n],b[]=new int[m];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		int c=0;
		for(int i=0; i<m; i++) {
			int x=Integer.parseInt(st.nextToken());
			if(x>=a[c]) ++c;
			if(c==n) break;
		}
		System.out.println(n-c);
	}

}
