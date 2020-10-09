package code_forces.Div2.Educational_round;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Array_Walk {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringTokenizer s = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),z=Integer.parseInt(st.nextToken());
			int a[]=new int[n],max=0,p=0;
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(s.nextToken());
				if(i<=k) {
					if(a[i]>=max) {
						max=a[i];p=i;
					}
				}
			}
			int sum=0,m=0,p1=0;
			for(int i=0; i<=p; ++i) sum+=a[i];
	        if(a[p-1]>=a[p]) {m=a[p-1];p1=p-1;}
	        sum=sum+(z/2)*a[p]+(z-z/2)*a[p-1];
	        if((z&1)==1) p=p1;
			for(int i=p; i<p+(k-p); ++i) sum+=a[i];
			System.out.println(sum);
		}
    }

}
