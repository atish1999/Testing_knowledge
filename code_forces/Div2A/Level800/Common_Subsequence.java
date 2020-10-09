package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Common_Subsequence {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),
			a[]=new int[n],b[]=new int[m];
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			StringTokenizer s2 = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Integer.parseInt(s1.nextToken());
			for(int i=0; i<m; i++) b[i]=Integer.parseInt(s2.nextToken());
			int k=0,ans=0;
			for(int i=0; i<n; i++) {
				boolean f=false;
				for(int j=0; j<m; j++) {
					if(a[i]==b[j]) {
						f=true;++k;break;
					}
				}
				if(k==1) {
					ans=a[i];break;
				}
			}
			System.out.println(k==0?"NO":"YES\n"+k+" "+ans);
		}

	}

}
