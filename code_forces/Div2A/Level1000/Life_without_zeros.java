package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Life_without_zeros {
	
	static long f(long x) {
		long temp=0;
		while(x>0) {
			if(x%10!=0) {
				temp=temp*10+x%10;
			}x/=10;
		}
		
		long y=0;
		while(temp>0) {
			y=y*10+temp%10;
			temp/=10;
		}
		return y;
	}
	public static void main(String[]args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a=Long.parseLong(br.readLine()),b=Long.parseLong(br.readLine()),c=a+b;
		System.out.println(f(c)==f(a)+f(b)?"YES":"NO");
    }
   

//	public static void main(String[] args)throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String a=br.readLine(),b=br.readLine(),a1="",b1="",c1="";
//		int c=Integer.parseInt(a)+Integer.parseInt(b);
//		String c2=Integer.toString(c);
//		for(int i=0; i<a.length(); i++)  if(a.charAt(i)!='0') a1+=a.charAt(i);
//		for(int i=0; i<b.length(); i++)  if(b.charAt(i)!='0') b1+=b.charAt(i);
//		for(int i=0; i<c2.length(); i++) if(c2.charAt(i)!='0') c1+=c2.charAt(i);
//		int n1=Integer.parseInt(a1),n2=Integer.parseInt(b1),n3=Integer.parseInt(c1);
////		System.out.printf("%d %d %d ",n1,n2,n3);
//		System.out.println((n1+n2)==n3?"YES":"NO");
//		
//	}

}
