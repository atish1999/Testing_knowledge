package code_forces.Div2C.Level1200;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Alphabetic_Removals {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
		String s=br.readLine();
		int a[]=new int[26];
		for(int i=0; i<s.length(); ++i) ++a[s.charAt(i)-97];
		int l=0;
		while(k>0) {
			if(a[l]>=k) {
				a[l]-=k;
				k=0;
			}else {
				k-=a[l];
				a[l]=0;
				++l;
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=n-1; i>=0; i--) {
			if(a[s.charAt(i)-97]>0) {
				sb.append(s.charAt(i));
				--a[s.charAt(i)-97];
			}else continue;
		}
		System.out.println(sb.reverse());
	}
//   O(N^2)
	static void solve(String s, int n, int k) {
		int a[]=new int[26];
		boolean b[]=new boolean[n];
		for(int i=0; i<s.length(); ++i) ++a[s.charAt(i)-97];
		outer:
		for(int i=0; i<26;) {
			if(a[i]!=0) {
				char ch=(char)(i+97);
				for(int j=0; j<n; j++) {
					if(s.charAt(j)==ch && k!=0 && a[i]!=0) {
						b[j]=true;
						--k;
						--a[i];
					}
					if(k==0) break outer;
					if(a[i]==0) ++i;
				}
			}else ++i;
		}
		String ans="";
		for(int i=0; i<n; i++) {
			if(!b[i]) ans+=s.charAt(i);
		}
		if(ans.equals("")) return;
		System.out.println(ans);
	}
}
