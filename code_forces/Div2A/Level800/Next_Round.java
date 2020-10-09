package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Next_Round {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),a[]=new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		int ans=0;
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(s.nextToken());
			if(a[i]>0 && a[i]>=a[k-1]) ++ans;
		}
		System.out.println(ans);
	}

}
