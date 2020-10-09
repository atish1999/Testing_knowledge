package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Little_Pigs_and_Wolves {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(s1.nextToken()),m=Integer.parseInt(s1.nextToken());
		char a[][]=new char[n][m];boolean b[][]=new boolean[n][m];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				a[i][j]=s.charAt(j);
			}
		}
		
		int ans=0;
		//moving row-wise
		for(int i=0; i<n; i++) {
			for(int j=0; j<m-1; j++) {
				if(a[i][j]=='P'&&a[i][j+1]=='W' || a[i][j]=='W'&&a[i][j+1]=='P') {
					a[i][j]='.';a[i][j+1]='.';++ans;
				}
			}
		}
		//moving column-wise
		for(int j=0; j<m; j++) {
			for(int i=0; i<n-1; i++) {		
				if(a[i][j]=='P'&&a[i+1][j]=='W' || a[i][j]=='W'&&a[i+1][j]=='P') {
						a[i][j]='.';a[i+1][j]='.';++ans;
				}
			}
		}
		System.out.println(ans);
	}

}
