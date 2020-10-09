package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class After_Training {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		for(int i=0; i<n; i++) {
			int t=i%m;
			if((m&1)==1) {
				System.out.println((t+1)/2*((t&1)==1?-1:1)+m/2+1);
			}else {
				System.out.println((t+1)/2*((t&1)==1?1:-1)+m/2);
			}
		}
		
		
	}
	//O(n^2)
	// we will be getting TLE
	static void solve(int n, int m) {
		int mid=(m&1)==0?m/2:(m/2)+1;
		int a[]=new int[m],y=(m+1)/2;
		boolean b[]=new boolean[m+1];
		a[0]=mid;
		b[mid]=true;
		if((m&1)==0) {a[1]=mid+1;b[mid+1]=true;}
		int z=(m&1)==0?2:1;
		for(int i=z; i<m; i++) {
			int min=Integer.MAX_VALUE,p=Integer.MAX_VALUE;
			for(int j=1; j<=m; j++) {
				int x=Math.abs(y-j);
				if(x<min && !b[j]) {
					min=x;
					p=j;
				}else if(x==min && !b[j]) {
					p=Math.min(p, j);
				}
			}
			a[i]=p;
			b[p]=true;
		}
		int j=0;
		while(n-->0) {
			System.out.println(a[j]);
			++j;
			if(j==m) j=0;
		}
	}

}
