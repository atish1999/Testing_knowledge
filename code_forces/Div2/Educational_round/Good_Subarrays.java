package code_forces.Div2.Educational_round;
import java.util.*;
import java.io.*;
public class Good_Subarrays {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			String s=br.readLine();
			for(int i=0; i<n; i++) a[i]=s.charAt(i)-'0'-1;
			//calculating prefix sum
			int prefixSum[]=new int[n];
			for(int i=0; i<n; i++) {
				if(i==0) prefixSum[i]=a[i];
				else prefixSum[i]=prefixSum[i-1]+a[i];
			}
			
		}

	}

}
