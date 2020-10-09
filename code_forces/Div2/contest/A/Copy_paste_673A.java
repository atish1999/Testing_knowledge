package code_forces.Div2.contest.A;
import java.util.*;
import java.io.*;

public class Copy_paste_673A {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
			int a[]=new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
			Arrays.sort(a);
			long sum=0;
			for(int i=1; i<n; i++) {
				sum+=(k-a[i])/a[0];
			}
			System.out.println(sum);
		}
	}
}
