package code_chef.cook_off.august2020;
import java.util.*;
import java.io.*;
public class Chef_and_Work {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
			int w[]=new int[n];
			st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) w[i]=Integer.parseInt(st.nextToken());
			solve1(w,k);
		}
	}
	//method-1
	static void solve1(int w[], int k) {
		boolean ok=true;
		for(int i=0; i<w.length; i++) {
			if(w[i]>k) {ok=false;break;}
		}
		if(!ok) System.out.println(-1);
		else{
			int sum=0,c=0;
			for(int i=0; i<w.length; i++) {
				sum+=w[i];
				if(sum>k) {
					sum=0;
					++c;
					--i;
				}
			}
			System.out.println(c+1);
		}
	}

}
