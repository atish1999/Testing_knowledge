package CSES.Introductory_problems;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Repetitions {
	public static void main(String[] args) throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char s[]=br.readLine().toCharArray();int max=1,c=1;
		for(int i=0; i<s.length-1; i++) {
			if(s[i]==s[i+1]) ++c;
			else c=1;
			max=Math.max(c, max);
		}
		
		System.out.println(max);
	}

//	public static void main(String[] args) throws java.lang.Exception
//	{		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		char s[]=br.readLine().toCharArray();int max=1,c=1;
//		for(int i=1; i<s.length; i++) {
//			if(s[i]==s[i-1]) ++c;
//			else c=1;
//			max=Math.max(c, max);
//		}
//		
//		System.out.println(max);
//	}

}
