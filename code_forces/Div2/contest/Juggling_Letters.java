package code_forces.Div2.contest;
import java.util.*;
import java.io.*;
public class Juggling_Letters {

	public static void main(String[] args) throws java.lang.Exception  
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0) {
        	int n=Integer.parseInt(br.readLine()),a[]=new int[26],m=n;
        	while(n-->0) {
        		String s=br.readLine();
        		for(int i=0; i<s.length(); i++) {
        			++a[s.charAt(i)-97];
        		}
        	}
        	boolean ok=true;
        	for(int i=0; i<a.length; i++) {
        		if(a[i]!=0 && a[i]%m!=0) {
        			ok=false;
        			break;
        		}
        	}
        	System.out.println(ok?"YES":"NO");
        }
	}

}
