package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Help_Kingdom_of_Far_Far_Away_2 {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();int p=0;
		StringBuilder sb=new StringBuilder();
		if(s.charAt(0)=='-') {sb.append("($");p=-1;}
		else sb.append("$");
		int c=s.indexOf('.'),n=s.length()-1,f=0;
		if(c!=-1) n=c-1; //(n would be the last index of decimal part.)
		if(p==-1) p=1;
		if((n-p+1)%3==1) f=p;
		else if((n-p+1)%3==2) f=p+1;
		else f=p+2;
		for(int i=p; i<=f; i++) {
			sb.append(s.charAt(i));
			if(i==f && f!=n) sb.append(',');
		}
		System.out.println(f);
		for(int i=f+1; i<=n; i++) {
			sb.append(s.charAt(i));
			if((f==0 || f==3) && i%3==0 && i!=n) sb.append(',');
			else if(f==1 && i%3==1 && i!=n) sb.append(',');
			else if(f==2 && i%3==2 && i!=n) sb.append(',');
		}
		if(c==-1) sb.append(".00");
		else {
			sb.append("."+s.charAt(c+1));
			if(c+2<s.length()) sb.append(s.charAt(c+2));
			else sb.append(0);
		}
		if(s.charAt(0)=='-') sb.append(")");
		System.out.println(sb);
	}

}
