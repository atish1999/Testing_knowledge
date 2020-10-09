package code_forces.Div2B.Level1400;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Regular_Bracket_Sequence {

	public static void main(String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s=br.readLine();int c=0,ans=0;
	    for(int i=0; i<s.length(); i++) {
	    	if(s.charAt(i)=='(') ++c;
	    	else {
	    		if(c>0) {--c;++ans;}
	    		else c=0;
	    	}
	    }
	    System.out.println(2*ans);
	}
//	public static void main(String[] args) throws java.lang.Exception
//	{
//	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    String s=br.readLine();int c=0;
//	    int open=0,close=0;
//	    for(int i=0; i<s.length(); i++) {
//	    	if(s.charAt(i)=='(') {++c;++open;}
//	    	else {
//	    		++close;
//	    		if(c>0) --c;
//	    	}
//	    }
	//c==0 means jitni opening bracket hai uski respective closing bracket hai...
//	    if(open==close) System.out.println(c==0?s.length():s.length()-2*c);
//	    else if(open>close) System.out.println(2*(open-c));
//	    else System.out.println(c==0?2*open:2*(open-c));    
//	}

}
