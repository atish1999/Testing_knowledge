package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Common_Prefixes {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			int n =Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n;i++) a[i]=Integer.parseInt(st.nextToken());
			char s[]="a".repeat(200).toCharArray();
			System.out.println(s);
			for(int i=0; i<n; i++) {
				if(s[a[i]]=='a') s[a[i]]='b';
				else s[a[i]]='a';
				System.out.println(s);
			}
			
				
		}
			
	}

} 

