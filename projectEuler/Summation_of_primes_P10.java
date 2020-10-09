package projectEuler;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Summation_of_primes_P10 {

	public static void main(String[] args) throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//method-1 (by using sieve)
		int n=Integer.parseInt(br.readLine());
		boolean prime[]=new boolean[n+1];
		for(int i=2; i<n+1; i++) prime[i]=true;
		for(int i=2; i*i<=n; i++) {
			if(prime[i]) {
				for(int j=i*i; j<=n; j+=i) prime[j]=false;
			}
		}
		long sum=0;
		for(int i=0; i<n+1; i++) if(prime[i]) sum+=i;
		System.out.println(sum);
	}

}
