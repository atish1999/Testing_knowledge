package code_forces.Div2A;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Johnny_and_Ancient_Computer {
	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a=Long.parseLong(st.nextToken()),b=Long.parseLong(st.nextToken()),count=0;
			if(a==b) {
				System.out.println(0);
				continue;
			}
			if(a>b) {a^=b;b^=a;a^=b;}
			while(a<b) {
				if(a*8<=b) {
					a*=8;++count;
				}else if(a*4<=b) {
					a*=4;++count;
				}else if(a*2<=b) {
					a*=2;++count;
				}else break;
			}
			System.out.println(a==b?count:-1);
		}
		
	}

//	public static void main(String[] args) throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			long a=Long.parseLong(st.nextToken()),b=Long.parseLong(st.nextToken()),count=0;
//			if(a==b) {
//				System.out.println(0);
//				continue;
//			}
//			if(a<b) {a^=b;b^=a;a^=b;}
//			while(a>=b) {
//				if(a/8>=b && a%8==0) {
//					a/=8;++count;
//				}else if(a/4>=b && a%4==0) {
//					a/=4;++count;
//				}else if(a/2>=b && a%2==0) {
//					a/=2;++count;
//				}else break;
//			}
//			System.out.println(a==b?count:-1);
//		}
//		
//	}
}
