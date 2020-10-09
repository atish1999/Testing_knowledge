package code_forces.Div2C.Level1300;
import java.util.*;
import java.io.*;

public class Good_Array {

	static int mod = (int) (1e6);

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 1;
		while (t-- > 0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			long sum=0;
			int cnt[]=new int[mod+1];
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(st.nextToken());
				sum+=a[i];
				++cnt[a[i]];
			}
			List<Integer> l=new ArrayList<>();
			for(int i=0; i<n; i++) {
				sum-=a[i];
				--cnt[a[i]];// here we are removing the frequency of ith element
//	after removing i th element we are looking for an element 
//	which is equal to the sum of the rest of the elements 
//i.e. total sum would be even(after removing ith one)
//	.i.e. that element must be sum/2 ( here sum=sum-a[i])
//	and also element <=10^6 cnt[sum/2]>0 means element is present
				if((sum&1)==0 && sum/2<=mod && cnt[(int) (sum/2)]>0) {
					l.add(i+1);
				}
				sum+=a[i];
				++cnt[a[i]];
			}
			StringBuilder ans=new StringBuilder();
			ans.append(l.size()+"\n");
			for(int x: l) {
				ans.append(x+" ");
			}
			System.out.println(ans.toString().trim());
		}		
	}
}