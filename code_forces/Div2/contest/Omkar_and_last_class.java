package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Omkar_and_last_class {
	
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			long n=Integer.parseInt(br.readLine());
			int div=0;
			boolean prime=true;
			for(div=2; div*div<=n; ++div) {
				if(n%div==0) {prime=false;break;}
			}
			System.out.println(!prime?n/div+" "+(n-n/div):1+" "+(n-1));
		}

	}
	
//	public static void main(String[] args) throws java.lang.Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t =Integer.parseInt(br.readLine());
//		while(t-->0) {
//			long n=Integer.parseInt(br.readLine());
//			if((n&1)==0) System.out.println(n/2+" "+n/2);
//			else {
//				if(isPrime(n)) System.out.println(1+" "+(n-1));
//				else {
//					for(int i=3; i*i<=n; i+=2) {
//						if(n%i==0) {
//							System.out.println(n/i+" "+(n-n/i));
//							break;
//						}
//					}
//				}
//			}
//		}
//
//	}
//	static boolean isPrime(long n) {
//		if(n<=1) return false;
//		if(n<=3) return true;
//		if(n%2==0 || n%3==0) return false;
//		for(int i=5; i*i<=n; i+=6) if(n%i==0 || n%(i+2)==0) return false;
//		return true;
//	}

}
