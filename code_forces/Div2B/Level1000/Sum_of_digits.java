package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_of_digits {
	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		if(s.length()==1) System.out.println(0);
		else {
			int count=0;
			while(s.length()>1) {
				int sum=0;
				for(int i=0; i<s.length(); i++) {
					sum+=Integer.parseInt(""+s.charAt(i));
				}
				++count;
				s=""+sum;//by using append function to convert integer to string
			}
			System.out.println(count);
		}
	}

//	public static void main(String[] args) throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s=br.readLine();
//		if(s.length()==1) System.out.println(0);
//		else {
//			int count=0;
//			while(s.length()>1) {
//				int sum=0;
//				for(int i=0; i<s.length(); i++) {
//					sum+=s.charAt(i)-48;
//				}
//				++count;
//				s=Integer.toString(sum);
//			}
//			System.out.println(count);
//		}
//	}
}
