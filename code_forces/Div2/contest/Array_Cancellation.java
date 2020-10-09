package code_forces.Div2.contest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_Cancellation {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer st=new StringTokenizer(br.readLine());
			long temp=0,ans=Long.MAX_VALUE;
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(st.nextToken());
				temp+=a[i];
				ans=Math.min(ans, temp);
			}
			System.out.println(Math.abs(ans));
		}
	}

}
