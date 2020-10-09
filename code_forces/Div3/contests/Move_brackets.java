package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Move_brackets {
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),c=0;
			String s=br.readLine();int ans=Integer.MAX_VALUE,o=0;
			for(int i=0; i<n; i++) {
				if(s.charAt(i)=='(') ++o;
				else --o;
				ans=Math.min(o, ans);
			}
			System.out.println(Math.abs(ans));
			
		}

	}

//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t =Integer.parseInt(br.readLine());
//		while(t-->0) {
//			int n=Integer.parseInt(br.readLine()),c=0;
//			String s=br.readLine();int ans=0,o=0;
//			for(int i=0; i<n; i++) {
//				if(s.charAt(i)=='(') {++o;}
//				else {
//					if(o>0) --o;
//					else if(o==0) ++ans;
//				}
//			}
//			System.out.println(ans);
//			
//		}
//
//	}

}
