package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Accurate_Lee {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			int n=Integer.parseInt(br.readLine());
			char s[]= br.readLine().toCharArray();
			boolean f=true;
			for(int i=0; i<n-1; i++) {
				if(s[i]>s[i+1]) {f=false;break;}
			}
			if(f) {
				System.out.println(s);
				continue;
			}
			List<Character> l=new ArrayList<>();
			for(int i=0; i<n; i++) {
				if(s[i]=='1') break;
				l.add('0');
			}l.add('0');
			for(int i=n-1; i>=0; i--) {
				if(s[i]=='0') break;
				l.add('1');
			}
			for(char e: l) System.out.print(e);
			System.out.println();
		}

	}


}
