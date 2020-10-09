package code_forces.Div2A.Level1400;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Adding_Digits {
	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int a=Integer.parseInt(s1.nextToken()),b=Integer.parseInt(s1.nextToken()),n=Integer.parseInt(s1.nextToken());
		a*=10;boolean ok=false;String ans="";
		for(int i=0; i<=9; i++) {
			if((a+i)%b==0){
				ans=""+(a+i);String str="0";
				ans+=str.repeat(n-1);//repeat() is available only in the versions java 11 or above
				ok=true;break;
			}
		}
		System.out.println(ok?ans:-1);
	}

}
