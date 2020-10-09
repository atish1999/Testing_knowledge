package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Dima_and_To_do_List {

	static int n,k;
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());k=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		int p[]=new int[n];
		for(int i=0; i<n; i++) p[i]=Integer.parseInt(st.nextToken());
//		we have to calculate minimum power in maximum tell session..
		solve2(p);
		
	}
	//O(n)
	static void solve2(int []p) {
		int sum[]=new int[k];
		for(int i=0; i<n; i++) sum[i%k]+=p[i];
		int ans=0,min=sum[0];
		for(int i=1; i<k; i++) {
			if(sum[i]<min) {min=sum[i];ans=i+1;}
		}
		System.out.println(ans==0?1:ans);
	}
	//O(n^2)
	static void solve1(int []p) {
		int n=p.length;
		if(k==1 || n==1) {
			System.out.println(1);
		}
		else {
			int ans=Integer.MAX_VALUE,min=Integer.MAX_VALUE;
			int tell=n/k;
			for(int i=0; i<k; i++) {
				int power=0,count=0;
				for(int j=i; j<n && count<tell; j+=k,++count) {
					j%=n;
					power+=p[j];
				}
				if(count==tell && min>power) {
					min=power;ans=i+1;
				}
			}
			System.out.println(ans);
		}	
	}

}
