package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Lucky_Substrings {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char s[]=br.readLine().toCharArray();
		int c1=0,c2=0;
		for(int i=0; i<s.length; i++) {
			if(s[i]=='4') ++c1;
			else if(s[i]=='7')++c2;
		}
		System.out.println(c1==0&&c2==0?-1:c1>=c2?4:7);
	}

}
