package code_forces.Div2A.Level800;

import java.io.*;
import java.util.*;

public class Soroban {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		if(n==0) System.out.println("O-|-OOOO");
		else {
			int t=(int)Math.log10(n)+1;
			char c[][] = new char[t][8];
			for(int i=0; i<t; i++) {
				int x=n%10;
				n/=10;
				int d=0;
				c[i][2]='|';
				if(x<5) {
					c[i][0]='O';c[i][1]='-';
					d=x;
				}else if(x>=5) {
					c[i][0]='-';c[i][1]='O';
					d=x-5;
				}
				for(int k=3; k<8; k++) {
					if(k-3==d) c[i][k]='-';
					else c[i][k]='O';
				}
				for(int j=0; j<8; j++) System.out.print(c[i][j]);
				System.out.println();
			}
		}		
	}
}
