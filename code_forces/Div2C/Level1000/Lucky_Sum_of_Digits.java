package code_forces.Div2C.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Lucky_Sum_of_Digits {
	public static void main(String[] args)throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			if(n%7==0) System.out.println("7".repeat(n/7));
			else {
				int b=1;boolean ok=false;
				while((n-7*b)/4<=n) {
					if(((n-(7*b))/4)%4==0) {
						int a=(n-(7*b))/4;
						System.out.println(a+" "+b);
						ok=true;
						break;
					}else ++b;
				}
				if(!ok) System.out.println(-1);
			}
		}
	}

//			public static void main(String[] args)throws java.lang.Exception{
//				 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				 int n =Integer.parseInt(br.readLine()),c=0;
//				 int r = n%7,nf=0;
//				 if(r==1) nf=2;
//				 if(r==2) nf=4;
//				 if(r==3) nf=6;
//				 if(r==4) nf=1;
//				 if(r==5) nf=3;
//				 if(r==6) nf=5;		        
//				 int x=n-nf*4;
//			     System.out.println(x<0?-1:"4".repeat(nf)+""+"7".repeat(x/7));
//			}
//	public static void main(String[] args)throws java.lang.Exception
//	{
//	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    try {
//		    int n =Integer.parseInt(br.readLine()),c=0;
//		    if(n%4==1 && n<21) System.out.println(-1);
//		    else {
//			    while(n!=0) {
//			    	++c;
//			    	if((n-4)%7==0) {
//			    		System.out.println(("4".repeat(c))+""+("7".repeat(n/7)));break;
//			    	}else if(n%7==0) {
//			    		System.out.println(("7".repeat(n/7)));break;
//			    	}
//			    	else n-=4;
//			    }
//		    }
//	    }catch(Exception e) {
//	    	System.out.println(-1);
//	    }
//	}

}
