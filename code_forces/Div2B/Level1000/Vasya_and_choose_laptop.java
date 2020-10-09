package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Vasya_and_choose_laptop {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()),a[][]=new int[n][4];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<4; j++) {
				a[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int no=Integer.MAX_VALUE,po=0;
		boolean b[] = new boolean[n];
		for(int i=0; i<n; i++) {
			int s=a[i][0],r=a[i][1], hdd=a[i][2];
			for(int j=0; j<n; j++) {
				if(s<a[j][0] && r<a[j][1] && hdd<a[j][2]  && !b[i]) {
					b[i]=true;// only for outdated one...
					break;
				}
			}
		}
		
//		for(boolean e: b)System.out.print(e+" ");
//		System.out.println();
		for(int i=0; i<n; i++) {
			if(!b[i] && no>=a[i][3]) {
				no=a[i][3];
				po=i+1;
			}
			
		}	
		System.out.println(po);	
	}

}
