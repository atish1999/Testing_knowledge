package code_forces.Global_Round;
import java.util.*;
import java.lang.*;
import java.io.*;


public class C_plusA {
	
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a =Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),
			c=Integer.parseInt(st.nextToken()),count=0;
			while(a<=c && b<=c) {
				if(a>b) b+=a;
				else a+=b;
				++count;
			}
			System.out.println(count);
		}
    }
	
//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int a =Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),
//			c=Integer.parseInt(st.nextToken()),count=1,sum=a+b;
//			while(sum<=c) {
//				if(a>b) {
//					b=sum;
//					sum+=a;
//				}else {
//					a=sum;
//					sum+=b;
//				}
//				++count;
//			}
//			System.out.println(count);
//		}
//    }

//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int a =Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),
//			c=Integer.parseInt(st.nextToken()),c1=0,c2=0,d=a,e=b;
//			while(true) {
//				if(a>c||b>c) break;
//				else {
//					a+=b;++c1;
//					if(a>c) break;
//					b+=a; ++c1;
//					if(b>c) break;
//				}
//			}
//			while(true) {
//				if(d>c||e>c) break;
//				else {
//					e+=d; ++c2;
//					if(e>c) break;
//					d+=e;++c2;
//					if(d>c) break;
//				}
//			}
//			System.out.println(Math.min(c1, c2));	
//		}
//	}

}
