package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Garland {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine(),s1=br.readLine();
		int a[]=new int[26],b[]=new int[26];
		for(int i=0; i<s.length(); i++) ++a[s.charAt(i)-97];
		for(int i=0; i<s1.length(); i++) ++b[s1.charAt(i)-97];
		int ans=0;
		boolean ok=true;
		for(int i=0; i<26; i++) {
			int m=Math.min(a[i], b[i]);
			if(m!=0) {
				ans+=m;
			}else {
				if(a[i]==0 && b[i]!=0) {ok=false; break;}
				else continue;
			}
		}
		System.out.println(ans==0 || !ok ?-1:ans);
	}

}
