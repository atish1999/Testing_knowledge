package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Hard_Work {

	static String filter(String a) {
		String g="";
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)!=';'&& a.charAt(i)!='-' && a.charAt(i)!='_' )
//			if(!(a.charAt(i)==';'|| a.charAt(i)=='-' || a.charAt(i)=='_' ))	
//	  both the above 2 lines meaning are equal according to De-Morgan law
//	  (a+b+c)'=a'*b'*c'.
//     means when these above three characters are not present then append character into string g
				g+=a.charAt(i);
		}
		return g.toLowerCase();
	}
	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1=filter(br.readLine()),s2=filter(br.readLine()),s3=filter(br.readLine());
		Set<String> m=new HashSet<>();
		m.add(s1+s2+s3);
		m.add(s1+s3+s2);
		m.add(s2+s1+s3);
		m.add(s2+s3+s1);
		m.add(s3+s1+s2);
		m.add(s3+s2+s1);
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			String s=filter(br.readLine());
			System.out.println(m.contains(s)?"ACC":"WA");
		}
	}
}
