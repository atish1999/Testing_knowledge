package code_forces.Div2C.Level1000;
import java.util.*;
import java.io.*;
public class Letters {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		long p[]=new long[n+1];
		p[0]=0;
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			long a=Long.parseLong(st.nextToken());
			if(i==0) p[i+1]=a;
			else p[i+1]=p[i]+a;
		}
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			long a=Long.parseLong(st.nextToken());
			int x=Arrays.binarySearch(p, a);
//			if the key not found return-(low+1)
//			i.e. here low=position of the next big number greater than the key value.
//			it returns lower bound as well as upper bound.
			if(x<0) {x*=-1;--x;}
//			this x is 1 based indexing.
			System.out.println(x+" "+(a-p[x-1]));
		}
	}
	static void solve()throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		long p[]=new long[n+1];
		p[0]=0;
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			long a=Long.parseLong(st.nextToken());
			if(i==0) p[i+1]=a;
			else p[i+1]=p[i]+a;
		}
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			long a=Long.parseLong(st.nextToken());
			int x=fun(p,a,n);
			System.out.println((x+1)+" "+(a-p[x]));
		}
	}
//	it returns lower bound.(with the help of binary_search)
	static int fun(long a[],long element, int n) {
		int l=0,r=n,d=-1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(a[mid]==element) return mid-1;
			else if(a[mid]>element) r=mid-1;
			else {d=mid;l=mid+1;}
		}
		return d;
	}
	
}
