package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Fedor_and_New_Game {

	public static void main(String[] args)  throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
		int a[]=new int[m+1];
		for(int i=0; i<m+1; i++) a[i]=Integer.parseInt(br.readLine());
		int ans=0;
		for(int i=0; i<m; i++) {
			int res=a[i]^a[m];//in bits when there will be 1 in that positions 2 numbers differ
			if(c1(res)<=k) ++ans;//both c1 and count will be calculating no. of 1 in bitwise representation
		}
		System.out.println(ans);
	}
	static int c1(int n) {//this function count number of 1's in bitwise representation
		int c=0;
		for(int i=0; (1<<i)<=n; i++) if((n&(1<<i))!=0) ++c;
		return c;
	}
	static int count(int n) {//this function count number of 1's in bitwise representation
		int c=0;
		while(n!=0) {
			n=n&(n-1);
			++c;
		}
		return c;
	}
	
}
