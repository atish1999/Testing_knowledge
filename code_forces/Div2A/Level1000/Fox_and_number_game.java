package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Fox_and_number_game {
	
	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]= new int[n],x=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(x<n) {a[x]=Integer.parseInt(st.nextToken());++x;}
		for(int j=1; j<n; j++) {
			if(a[0]!=a[j]) {
				if(a[0]>a[j]) a[0]-=a[j];
				else a[j]-=a[0];
				--j;
			}
		}
		System.out.println(n*a[0]);	
    }

	
//	public static void main(String[] args)  throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n=Integer.parseInt(br.readLine()),a[]= new int[n],x=0;
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		while(x<n) {a[x]=Integer.parseInt(st.nextToken());++x;}
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				if(a[i]!=a[j]) { // if a[i]=a[j] skip the iteration
//					if(a[i]>a[j]) a[i]-=a[j];
//					else a[j]-=a[i];
////					System.out.println(a[i]+" "+a[j]+" "+i+" "+j);
//					--j;//other wise reiterate from here
//					
//				}	
//			}
//		}
//		// optimal solution will be achieved only when all the 
//		// elements will be equal, otherwise we will do a[i]-=a[j]
//		// or a[j]-=a[i] to make our solution better
//		System.out.println(n*a[0]);
//    }

//	public static void main(String[] args)  throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n=Integer.parseInt(br.readLine()),a[]= new int[n],x=0;
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		while(x<n) {a[x]=Integer.parseInt(st.nextToken());++x;}
//		int result=a[0];
//		for(int i=1; i<n; i++) {
//			result=gcd(result, a[i]);
//		}
//		System.out.println(result*n);
//	
//	}
//	static int gcd(int a,int b) {
//		if(a<b) {
//			a^=b;
//			b^=a;
//			a^=b;
//		}
//		if(b==0) return a;
//		else return gcd(b, a%b);
//	}

}
