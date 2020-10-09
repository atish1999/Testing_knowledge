package code_forces.Div2.contest;
import java.util.*;
import java.io.*;
public class Maximum_Product {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			StringTokenizer st=new StringTokenizer(br.readLine());
			long a[]=new long[n];
			for(int i=0; i<n; i++) a[i]=Long.parseLong(st.nextToken());
			Arrays.sort(a);
/*			there is a probability of maximization of products are
			if odd number of positive elements will be there.(like 1,3 & 5)
			these are possible 6 cases.
						- - - - - 
						- - - - + (->)here product will be +ve
						- - - + +
						- - + + + (->)here product will be +ve
						- + + + +
						+ + + + + (->)here product will be +ve
			The first is the product of the 5 largest numbers, 
			the second the product of the 2 least and 3 largest numbers 
			and finally the third will be the 
			product of the 4 least and the 1 largest number.
			the solution will be the maximum of these 3 values. 
			The solution tries to keep the answer +ve and 
			that can be only done by selecting 
			an even number of -ve numbers(least numbers). 
			If there are no -ve numbers or all are -ve 
			then the solution will simply contain 
			the product of the largest 5 numbers[first value] 
			which will be the max possible product.
			
*/
			long p1=a[n-1]*a[n-2]*a[n-3]*a[n-4]*a[n-5];
			long p2=a[n-1]*a[n-2]*a[n-3]*a[0]*a[1];
			long p3=a[n-1]*a[0]*a[1]*a[2]*a[3];
			System.out.println(Math.max(p1, Math.max(p2, p3)));
		}
	}

}
