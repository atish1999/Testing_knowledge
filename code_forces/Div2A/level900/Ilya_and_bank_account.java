package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ilya_and_bank_account {
	
	 public static void main(String[]args) throws java.lang.Exception
	    {		
		 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 	int n =Integer.parseInt(br.readLine());
		 	if(n>=0) System.out.println(n);
		 	else {
		 		int c1=n/10, c2=(n/100)*10+n%10 ;
		 		System.out.println(c1>=c2 ?c1: c2);
		 	}
	    }

//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n =Integer.parseInt(br.readLine());
//		int c1=n/10;
//		String i = Integer.toString(n);
//		String i1=i.substring(0,i.length()-2),i2=i.substring(i.length()-1),i3=i1+i2;
//		int c2=Integer.parseInt(i3);
//		System.out.println(c1>=c2 && c1 >n ? c1: c2>c1 && c2>n ?c2:n);		
//	}

}
 