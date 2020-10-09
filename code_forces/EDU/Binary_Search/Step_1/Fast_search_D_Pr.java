package code_forces.EDU.Binary_Search.Step_1;
import java.util.*;
import java.io.*;
public class Fast_search_D_Pr {

	static int UpperBound(int a[], int x) {//closest to the left+1
		int l=-1,r=a.length;
		while(l+1<r) {
			int m=(l+r)>>>1;
	        if(a[m]<=x) l=m;
	        else r=m;
		}
		return l+1;
	}
	static int LowerBound(int a[], int x) {//closest to the right
		int l=-1,r=a.length;
		while(l+1<r) {
			int m=(l+r)>>>1;
	        if(a[m]>=x) r=m;
	        else l=m;
		}
		return r;
	}
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
		Arrays.sort(a);
		int k=Integer.parseInt(br.readLine());
		while(k-->0) {
			s = new StringTokenizer(br.readLine());
			int l=Integer.parseInt(s.nextToken()),r=Integer.parseInt(s.nextToken());
			int lb=LowerBound(a,l),ub=UpperBound(a,r);
			System.out.print(ub-lb+" ");
		}
		System.out.close();
	}
	static void solve() throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
//		List<Integer> a=new ArrayList<>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(s.nextToken());
//			a.add(Integer.parseInt(s.nextToken()));
		}
		long startTime=System.nanoTime();
		Arrays.sort(a);
//		Collections.sort(a);
		int k=Integer.parseInt(br.readLine());
		while(k-->0) {
			s = new StringTokenizer(br.readLine());
			int l=Integer.parseInt(s.nextToken()),r=Integer.parseInt(s.nextToken());
			int lb=b1(a, l),ub=b2(a, r);
			System.out.print(ub-lb+" ");
		}
		long endTime=System.nanoTime();
//		System.out.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
		System.out.close();
	}
	static int b1(int a[], int x) {
		int l=-1,r=a.length;
		while(l+1<r) {
			int m=(l+r)>>>1;
			if(a[m]<x) l=m;
			else r=m;
		}
		return l;
	}
	static int b2(int a[], int x) {
		int l=-1,r=a.length;
		while(l+1<r){
			int m=(l+r)>>>1;
			if(a[m]<=x) l=m;
			else r=m;
		}
		return l;
	}
}
