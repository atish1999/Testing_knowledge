package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class XXXXX_649_Div_2 {
	
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
			int a[]=new int[n],sum=0;
			StringTokenizer s = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(s.nextToken());
				sum+=a[i];
			}
			// if the sum is not divisible by x then maximum length will be the 
			//array length.but if it is divisible by x in that case we have to remove 
			// the element from both end of the array.after that we can check the same.
			int c=0,d=0;
			while(c<n && a[n-c-1]%x==0) {
				++c;		//if we check for the element which is divisible by x.in that case if we 
							//remove that elements then there will be a probability to find the sum
							// not divisible by x.
			}
			while(d<n && a[d]%x==0) {
				++d;
			}
			System.out.println(sum%x!=0?n: n-Math.min(c, d)-1);
				// for finding max value of x1-x2 ,x2 should be minimum.
		}
    }

//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t =Integer.parseInt(br.readLine());
//		while(t-->0) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int n=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
//			int a[]=new int[n],sum=0;
//			StringTokenizer s = new StringTokenizer(br.readLine());
//			for(int i=0; i<n; i++) {
//				a[i]=Integer.parseInt(s.nextToken());
//				sum+=a[i];
//			}
//			int y=sum;
//			if(sum%x!=0) {
//				System.out.println(sum==0?-1:n);
//			}else {
//				int c=0,d=0;
//				for(int i=n-1; i>=0; i--) {
//					sum-=a[i];
//					if(sum%x!=0) {
//						++c;
//						break;
//					}else ++c;
//				}
//				for(int i=0; i<n; i++) {
//					y-=a[i];
//					if(y%x!=0) {
//						++d; 
//						break;
//					}else ++d;
//				}
//				int ans=Math.max(n-c, n-d);
//				System.out.println(ans==0?-1:ans);
//			}
//			
//			
//		}
//	}

}
