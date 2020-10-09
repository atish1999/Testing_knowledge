package projectEuler;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kth_primeP7 {
	static boolean isPrime(int n) {
		if(n<=1) return false;
		else if(n<=3) return true;
		else if(n%2==0 || n%3==0) return false;
		else {
			for(int i=5; i*i<=n; i+=6) {
				if(n%i==0 || n%(i+2)==0) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count=1,no=1;//count =1 because 2 is the smallest prime.
		while(true) {
			no+=2;//all prime numbers except "2" are odd numbers.
			if(isPrime(no)) ++count;
			if(count==10001) {
				System.out.println(no);
				break;
			}
		}
	}

//	public static void main(String[] args) throws java.lang.Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n=Integer.parseInt(br.readLine());
//		boolean prime[]=new boolean[n+1];
//		for(int i=2; i<n+1; i++) prime[i]=true;
//		for(int i=2; i*i<=n; i++) {
//			if(prime[i]) {
//				for(int j=i*i; j<=n; j+=i) prime[j]=false;
//			}
//		}
//		int k=0;
//		for(int i=0; i<=n; i++) {
//			if(prime[i]) {
//				++k;
//				if(k==10001) {System.out.println(i);break;}
//			}
//		}
//
//	}

}
