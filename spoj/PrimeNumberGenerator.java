package spoj;

import java.util.Scanner;

public class PrimeNumberGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int i = sc.nextInt(), j = sc.nextInt();
			System.out.println(i+" "+j);
			boolean isPrime = false;
			for(int k=i; k<=j; k++){
				if(k<2){
					isPrime=false;
				}else{
					isPrime=true;
					for(int c=2; c*c<=k; c++){
						if(k%c==0){
							isPrime=false;
							break;
						}
					}
				}
				if(isPrime){
					System.out.print(k+" ");
				}
			}
		}
		
	}
	
}


