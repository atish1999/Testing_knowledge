package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Applejack_and_Storages {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int f[]=new int[100001];
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n2=0,n4=0,n6=0,n8=0;
		for(int i=0; i<n; i++) {
			int a=Integer.parseInt(st.nextToken());
			++f[a];
			if(f[a]==2) ++n2;
			else if(f[a]==4) ++n4;
			else if(f[a]==6) ++n6;
			else if(f[a]==8) ++n8;
		}
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			String s=br.readLine();
			int x=Integer.parseInt(s.substring(2));
			if(s.charAt(0)=='+') {
				++f[x];
				if(f[x]==2) ++n2;
				else if(f[x]==4) ++n4;
				else if(f[x]==6) ++n6;
				else if(f[x]==8) ++n8;
			}
			else {
				if(f[x]==2) --n2;
				else if(f[x]==4) --n4;
				else if(f[x]==6) --n6;
				else if(f[x]==8) --n8;
				--f[x];
			}
			System.out.println(n8>=1 || n6>=1 && n2>=2 || n4>=2 || n4>=1 && n2>=3?"YES":"NO");
		}
	}

}
