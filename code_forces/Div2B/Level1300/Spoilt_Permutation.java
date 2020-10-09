package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Spoilt_Permutation {

	public static void main(String[] args)  throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
		try {
			solve(a);
		}catch(Exception e) {
			System.out.println("# BINOD ");
		}
	}
//	My solutuion.
	static void solve(int a[], int n) {
		int l=0,r=0;
		boolean ok=true;
		for(int i=0,j=1; i<n&&j<n;  ) {
			if(a[i]<a[j]) {
				++j;++i;
		    }else if(a[j]<a[i]) {
				l=i+1;
				r=j+1;
				++j;
			}
		}
		boolean flag=true;
		if(r!=0) {
			for(int i=l; i<r; i++) {
				if(a[i-1]<a[i]) {flag=false;break;}
			}
		}
		boolean f=true;
		for(int i=r; i<n-1; i++) {
			if(a[i]>a[i+1]) {f=false;break;}
		}
		if(r!=0 && a[r-1]!=l|| l!=0 && a[l-1]!=r ||!flag ||!ok || !f) {l=0;r=0;}
		System.out.println(l+" "+r);
		
	}
//	Amish Solution
	static void solve(int a[]) {
		int n=a.length;
		int l=0,r=0;
		for(int i=0; i<n; i++) if(a[i]!=(i+1)) {l=i+1;break;}
		for(int i=n-1; i>=0; --i) if(a[i]!=(i+1)) {r=i+1;break;}
	    if(l==0 || r==0) System.out.println(0+" "+0);
	    else {
	    	boolean ok=true;
			for(int i=l-1,j=r; i<r; i++,j--) {
				if(a[i]!=j) {ok=false;break;}
			}
			System.out.println(l>r || !ok?(0+" "+0):(l+" "+r));
	    }
	}
}
