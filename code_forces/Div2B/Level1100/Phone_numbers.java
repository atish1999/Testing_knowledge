package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Phone_numbers {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			sb.append(s.charAt(i));
			if((i&1)==1 && i<n-(n&1)-2) sb.append('-');
		}
		System.out.println(sb);
	}
//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		String s = br.readLine();
//		if((n&1)==1) {
//			System.out.printf("%s%s%s",s.charAt(0),s.charAt(1),s.charAt(2));
//			for(int i=3; i<n; i+=2) System.out.print("-"+s.charAt(i)+""+s.charAt(i+1));
//		}else {
//			System.out.printf("%s%s",s.charAt(0),s.charAt(1));
//			for(int i=2; i<n; i+=2) System.out.print("-"+s.charAt(i)+""+s.charAt(i+1));
//		}
//	}

}
