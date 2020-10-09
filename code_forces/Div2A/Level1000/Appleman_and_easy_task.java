package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Appleman_and_easy_task {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s="";
		while(n-->0) {
			s+=br.readLine();
		}
		boolean p=true;
		for(int i=0,j=s.length()-1; i<j; i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {p=false;break;}
		}
		System.out.println(p?"YES":"NO");
    }

}
