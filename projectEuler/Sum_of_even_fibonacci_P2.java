package projectEuler;

public class Sum_of_even_fibonacci_P2 {

	public static void main(String[] args) {
		/*
		 * Find the sum of all the even-valued terms in the Fibonacci sequence
			which do not exceed four million.
		 */
		//method-1
		int sum=2;
		int a=1,b=2,c=0;
		while(c<4000000) {
			c=a+b;
			a=b;b=c;
			if((c&1)==0) sum+=c;
		}
		System.out.println(sum);
		//method-2
		//i.e. every third term in Fibonacci sequence is an even number
		int ans=0;
		int n1=1,n2=1,n3=n1+n2;
		while(n3<4000000) {
			ans+=n3;//initially n3=2
			n1=n2+n3;//then n1=3
			n2=n1+n3;//n2=5
			n3=n1+n2;//n3=8
			// and this process repeats untill the limit....
		}
		System.out.println(ans);
	}

}
