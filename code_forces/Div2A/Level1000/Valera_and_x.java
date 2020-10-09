package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Valera_and_x {
	
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char a[][]= new char[n][n];
		for(int i=0; i<n; i++) {
			String s=br.readLine();
			for(int j=0; j<n; j++) {
				a[i][j]=s.charAt(j);
			}
		}
		boolean f=true;int c=a[0][0],d=a[0][1];
		for(int i=0; i<n; i++) {
			if(c==d) {f=false; break;}
			for(int j=0; j<n; j++) {
				if(((j==i || j==n-1-i) && a[i][j]!=c) || (j!=i && j!=n-1-i && a[i][j]!=d)) {
					f=false; break;// or(((j==i || j==n-1-i) && a[i][j]!=c) || (!(j==i ||j==n-1-i) && a[i][j]!=d)))
				}
			}
			if(!f) break;
		}
		System.out.println(f ?"YES":"NO");
	}
//	public static void main(String[] args)throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		char a[][]= new char[n][n];
//		for(int i=0; i<n; i++) {
//			String s=br.readLine();
//			for(int j=0; j<n; j++) {
//				a[i][j]=s.charAt(j);
//			}
//		}
//		boolean f=true;int c=a[0][0],d=a[0][1];
//		for(int i=0; i<n; i++) {
//			if(c==d) {f=false; break;}
//			for(int j=0; j<n; j++) {
//				if((j==i || j==n-1-i) ){
//					if(a[i][j] !=c) {
//						f=false;break;
//					}
//				}else {
//					if(a[i][j]!=d) {
//						f=false; break;
//					}
//				}
//			}
//			if(!f) break;
//		}
//		System.out.println(f  ?"YES":"NO");
//	}

}
