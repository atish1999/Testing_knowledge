package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Levko_and_Permutation {

	static int n,k;
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());k=Integer.parseInt(st.nextToken());
		solve();
	}
	static void solve() {
		if(k>=n) System.out.println(-1);
		else {
			for(int i=n-k,c=1; i>=1; i--) {
				if(i==n-k) System.out.print(i+" ");
				else {
					System.out.print(c+" ");
					++c;
				}
			}
			for(int i=n-k+1; i<=n; i++) System.out.print(i+" ");
		}
	}

}