package code_forces.Div2A.Level800;

import java.util.*;

public class Cake_Minator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt(),c=sc.nextInt();
		char cake[][] = new char[r][c];
		for(int i=0; i<r; i++) {
			String s=sc.next();
			for(int j=0; j<c; j++) {
				cake[i][j]=s.charAt(j);
			}
		}
		int row=0,column=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(cake[i][j]=='S') {
					++row;
					break;
				}
			}
		}
		for(int j=0;j<c;j++) {
			for(int i=0; i<r;i++) {
				if(cake[i][j]=='S') {
					++column;
					break;
				}
			}
		}
		System.out.println((r*c)-(row*column));

	}

}
