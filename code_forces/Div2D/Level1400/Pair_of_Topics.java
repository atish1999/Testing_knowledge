package code_forces.Div2D.Level1400;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Pair_of_Topics {

	public static void main(String[] args) throws java.lang.Exception
    {		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n],b[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringTokenizer s=new StringTokenizer(br.readLine());
		int c[]=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			b[i]=Integer.parseInt(s.nextToken());
			c[i]=a[i]-b[i];
		}
/*
	INEQUALITY:
		a[i]+a[j]>b[i]+b[j]
	 or (a[i]-b[i])+(a[j]-b[j])>0
	 or c[i]+c[j]>0
	 or c[i]+c[j]>=1
	 or c[j]>=(1-c[i])
	 i.e. we have to find number of such j for which c[j]>=(1-c[i])
	 i.e. we have to calculate leftmost position j 
	 or minimal j for which c[j]>=x {here x=(1-c[i])}
	 i.e. we have to calculate lower bound of(1-c[i]).
	 Then add the value i−j to the answer and consider the next element.
	 total time complexity O(N*log(N))
*/
		sort(c);
		long ans=0;
		for(int i=0; i<n; i++) {
			if(c[i]<=0) continue;
/*  As array is sorted then c[i-1]<=c[i]
    i.e. if c[i]<=0 then  for any j in[0,i-1] c[i]+c[j] would be less than 0.that's 
	why we are ignoring negative numbers.
	Because our sum (c[i]+c[j]) must be greater than 0, 
	then at least one of these summands will be positive. So, if c[i]≤0, just skip it.
*/

			long lb=lower_bound(c,1-c[i]);
/*	c[lb] would be the smallest number for which c[lb]+c[i]>=1
	and  after that for any j in[lb,i) c[j]+c[i] would be greater than 1.
	that's why We are adding (i-lb) to our answer.
*/
			ans+=(i-lb);
			
		}
		System.out.println(ans);

	}
	
	static void sort(int a[]) {
		PriorityQueue<Integer> q=new PriorityQueue<>();
		for(int i=0; i<a.length; i++) q.add(a[i]);
		for(int i=0; i<a.length; i++) a[i]=q.poll();
	}
	static int lower_bound(int a[], int x) {//O(log(N))
		int l=-1, r=a.length;
		while(l+1<r) {
			int m=(l+r)>>1;
			if(a[m]>=x) r=m;
			else l=m;
		}
		return r;
	}
	
	static void solve()throws java.lang.Exception
    {	// 2 pointer approach	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n],b[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringTokenizer s=new StringTokenizer(br.readLine());
		int c[]=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			b[i]=Integer.parseInt(s.nextToken());
			c[i]=a[i]-b[i];
		}
		sort(c);
		int l=0,r=n-1;
		long ans=0;
		while(l<r) {
//	 as array is sorted then for a smaller l if (c[l]+c[r]>0) then 
//	 for all i in[l,r) c[i]+c[r] would be greater than 0.thats why we are adding (r-l)
//	 in answer and after that we are checking for preceeding r's that is we are trying 
//   to compute pair from the right end of the array.
			if(c[l]+c[r]>0) {
				ans+=(r-l);
				--r;
			}else ++l;
		}
		System.out.println(ans);
    }
}
