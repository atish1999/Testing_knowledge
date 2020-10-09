package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Almost_prime {

	public static void main(String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(br.readLine()),count=0;
	    boolean prime[]=new boolean[n+1];
	    for(int i=2; i<=n; ++i) prime[i]=true;
	    for(int i=2; i*i<=n; ++i) {
	    	if(prime[i]) {
	    		for(int j=i*i; j<=n; j+=i) prime[j]=false;
	    	}
	    }
	    for(int i=6; i<=n; ++i) {
	    	int c=0;
	    	for(int j=2; j<=i; ++j) {
	    		if(i%j==0 && prime[j]) ++c;
	    	}
	    	if(c==2) ++count;
	    }
	    System.out.println(count);
	}
//	static boolean isPrime(int n) {
//		if(n<=1) return false;
//		else if(n<=3) return true;
//		else if(n%2==0||n%3==0) return false;
//		else {
//			for(int i=5; i*i<=n; i+=6) {
//				if(n%i==0||n%(i+2)==0) return false;
//			}
//		}
//		return true;
//	}
//	public static void main(String[] args) throws java.lang.Exception
//	{
//	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    int n=Integer.parseInt(br.readLine()),count=0;
//	    for(int i=6; i<=n; i++) {
//	    	int c=0;
//	    	for(int j=2; j<=i; j++) {
//	    		if(i%j==0 && isPrime(j)) ++c;
//	    	}
//	    	if(c==2) ++count;
//	    }
//	    System.out.println(count);
//	}

}
