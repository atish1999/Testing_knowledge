package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Table {
	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),
		 a=-1;boolean check=false;
		for(int i=0; i<n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				a=Integer.parseInt(s.nextToken());
				if(a==1 &&(i==0||j==0 || i==n-1 || j==m-1)) {
					check=true;break;
				}
			}
			if(check) break;
		}
		System.out.println(check?2:4);
	
	}
//	public static void main(String[] args)  throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),
//		 a[][]=new int[n][m];boolean check=false;
//		for(int i=0; i<n; i++) {
//			StringTokenizer s = new StringTokenizer(br.readLine());
//			for(int j=0; j<m; j++) {
//				a[i][j]=Integer.parseInt(s.nextToken());
//				if(a[i][j]==1 &&(i==0||j==0 || i==n-1 || j==m-1)) {
//					check=true;break;
//				}
//			}
//			if(check) break;
//		}
//		System.out.println(check?2:4);
//	
//	}

}
