package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Permutation {
	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n],f[]=new int[50001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			++f[a[i]];
			
		}	
		int ans=0;
		for(int i=1; i<=n; i++) {
			if(f[i]==0) ++ans;//elements whose frequency is 0 should be added
		}
		System.out.println(ans);
		
	}

//	public static void main(String[] args)throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n=Integer.parseInt(br.readLine()),a[]=new int[n];
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		Set<Integer> h=new HashSet<>();
//		for(int i=0; i<n; i++) {
//			a[i]=Integer.parseInt(st.nextToken());
//			if(a[i]>=1 && a[i]<=n) h.add(a[i]);
//		}
//		System.out.println(n-h.size());
//	}
//	public static void main(String[] args)throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n=Integer.parseInt(br.readLine()),a[]=new int[n];
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
//		Set<Integer> h=new HashSet<>();
//		for(int i=0; i<n; i++) {
//			if(a[i]>=1 && a[i]<=n) h.add(a[i]);
//		}
//		System.out.println(n-h.size());
//	}

}
