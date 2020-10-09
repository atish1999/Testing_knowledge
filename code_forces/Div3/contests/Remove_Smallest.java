package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Remove_Smallest {

	public static void main(String[] args)  throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
			Arrays.sort(a);
			boolean ok=true;
			for(int i=n-1; i>0; i--) {
				if((int)Math.abs(a[i]-a[i-1])>1) {ok=false;break;}
			}
			System.out.println(ok?"YES":"NO");
		}
	}

}
