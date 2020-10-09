package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class T_primes {

//	numbers like 4,9,25,49.....have exactly 3 divisors.
	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()); long a[]=new long[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Long.parseLong(st.nextToken());
			if(isPrime((long)Math.sqrt(a[i])) && a[i]==(long)Math.sqrt(a[i])*(long)Math.sqrt(a[i]))
				System.out.println("YES");
			else System.out.println("NO");
		}
		
	}

	static boolean isPrime(long n) {
		if(n<=1) return false;
		if(n<=3) return true;
		if(n%2==0 || n%3==0) return false;
		for(int i=5; i*i<=n; i+=6) {
			if(n%i==0 || n%(i+2)==0) return false;
		}
		return true;
	}
}
