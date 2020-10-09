package code_forces.Div2.Educational_round;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum_of_digits {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n=Long.parseLong(st.nextToken()),k=Long.parseLong(st.nextToken());
			boolean find=true,x=false;long no=0;
			for(long i=0; i<Long.MAX_VALUE; i++) {
				long sum=0;
				for(long j=0; j<=k; j++) {
					if(f(i+j)<=n) {
						sum+=f(i+j);
					}else {
						find=false;
						break;
					}
				}
				if(sum==n) {
					no=i;x=true;;
				    break;
				}
			}
			System.out.println(x?no:-1);
			
		}

	}
	static long f(long n) {
		long sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

}
