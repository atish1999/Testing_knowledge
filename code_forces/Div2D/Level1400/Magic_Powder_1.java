package code_forces.Div2D.Level1400;
import java.util.*;
import java.io.*;
public class Magic_Powder_1 {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(s.nextToken()),k=Integer.parseInt(s.nextToken());
		int [] a=new int[n],b=new int[n];
		s=new StringTokenizer(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum1=0,sum2=k;
		for (int i = 0; i < n; i++) {
			a[i]=Integer.parseInt(s.nextToken());sum1+=a[i];
			b[i]=Integer.parseInt(st.nextToken());sum2+=b[i];
		}
//	I can make minimum 0 cookies and maximum (sum2/sum1) cookies.
		long l=0,r=sum2/sum1,ans=0;
		while(l<=r) {
//	so we are just checking whether mid number of cookies can be formed or not.
			long m=(l+r)>>>1;
			long cnt=0;
			for(int i=0; i<n; i++) {
				long req=a[i]*m;
//		cnt means how much gram ingredients I need extra.
				cnt+=Math.max(0, req-b[i]);
			}
//		if total number of ingredients needed greater than k we should decrease our r
//		otherwise we can bake mid number of cookies.
			if(cnt>k) r=m-1;
			else {
				ans=m;
				l=m+1;
			}
		}
		System.out.println(ans);
	}

}
