package projectEuler;

import java.util.*;

public class Largest_prime_factor_P3 {
	static boolean isPrime(long n) {
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
	public static void main(String[] args) {
		  List<Integer> prime_Factor=new ArrayList<>();
	      for(int i=2; i*i<=13195; i++) {
	    	  if(13195%i==0 && isPrime(i)) prime_Factor.add(i);
	      }
	      System.out.println(prime_Factor);
	}

}
