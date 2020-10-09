package code_forces.Div2.contest;
import java.util.*;
import java.io.*;
public class Mere_Array {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n],b[]=new int[n];
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(st.nextToken());
				b[i]=a[i];
			}
			Arrays.sort(b);
			boolean ok=true;
			for(int i=0; i<n; i++) {
				//when a[i] > b[i] && a[i] is not divisible by b[0]
				//because b[0] will be the minimum and that would be the gcd.
				if(a[i]!=b[i] && a[i]%b[0]!=0) {ok=false;break;}
			}
			System.out.println(ok?"YES":"NO");
		}
	}

}
