package code_chef.LunchTime.September_2020;
import java.util.*;
import java.io.*;

public class Watermelon {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n=Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a[]=new int[n];
			long sum=0;
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(st.nextToken());
				sum+=a[i];
			}
//			if the sum is at least 0 then there will be a chance
//			that sum can be 0.
			System.out.println(sum>=0?"YES":"NO");
		}
	}
}
