package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Find_Marble {
	
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),s=Integer.parseInt(st.nextToken()),t=Integer.parseInt(st.nextToken());
		int p[]=new int[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {p[i]=Integer.parseInt(st.nextToken());--p[i];}
		System.out.println(solve2(p,s,t));
    }
	//method-1
	static int solve(int a[], int s, int t) {
		--s;--t;
		boolean v[]=new boolean[a.length];
		v[s]=true;//initially marble was in this s-th position.
		int count=0;
		while(!v[t] && count<a.length) {
			v[a[s]]=true;//now marble position 
			v[s]=false;//is changed from s
			s=a[s]; // to a[s] position.
			++count;
		}
		return count<a.length?count:-1;
	}
	//method-2
	static int solve2(int a[], int s, int t) {
		--s;--t;
		if(s==t) return 0;// when starting and ending positions are same.
		else {
			int count=0,n=a.length;
			while(count<n && t!=a[s]) {
				s=a[s];//now marble position is changed.
				++count;
			}
			return count<n?count+1:-1;
		}	
	}
}
