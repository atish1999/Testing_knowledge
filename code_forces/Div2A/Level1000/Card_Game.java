package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Card_Game {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a=st.nextToken(),b=st.nextToken();
		char c[]= { '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A' };
		if(a.charAt(1)==b.charAt(1)){
			int m=0,n=0;
			for(int i=0; i<c.length; i++) {
				if(a.charAt(0)==c[i]) m=i;
				if(b.charAt(0)==c[i]) n=i;
			}
			System.out.println(m>n?"YES":"NO");
		}else if(a.charAt(1)==s.charAt(0)){
			System.out.println(a.charAt(1)!=b.charAt(1)?"YES":"NO");
//			else {
//				int m=0,n=0;
//				for(int i=0; i<c.length; i++) {
//					if(a.charAt(0)==c[i]) m=i;
//					if(b.charAt(0)==c[i]) n=i;
//				}
//				System.out.println(m>n?"YES":"NO");
//			}
		}else {
			System.out.println("NO");
		}
		
	}

}
