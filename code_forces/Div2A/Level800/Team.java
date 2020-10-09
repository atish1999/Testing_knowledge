package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Team {

	public static void main(String[] args)  throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine()),a[][]=new int[n][3];
		int ans=0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c=0;
			for(int j=0; j<3; j++) {
				a[i][j]=Integer.parseInt(st.nextToken());
				if(a[i][j]==1) ++c;
				if(c>=2) {++ans;break;}
			}
		}
		System.out.println(ans);
	}

}
