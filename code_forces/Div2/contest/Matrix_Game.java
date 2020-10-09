package code_forces.Div2.contest;

import java.util.*;

public class Matrix_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt(),m=sc.nextInt();
			int a[][]=new int[n][m];
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					a[i][j]=sc.nextInt();
				}
			}
			int row=n, column=m;
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(a[i][j]==1) {
						--row;
						break;
					}
				}
			}
			for(int j=0; j<m; j++) {
				for(int i=0; i<n; i++) {
					if(a[i][j]==1) {
						--column;
						break;
					}
				}
			}
			int mn=Math.min(row,column);
			
  		    System.out.println(mn%2==0?"Vivek":"Ashish");
		}
	}

}
