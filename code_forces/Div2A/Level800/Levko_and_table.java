package code_forces.Div2A.Level800;

import java.util.Scanner;

public class Levko_and_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(),x=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(i==j?x+" ":0+" ");
			}
			System.out.println();
		}


	}

}
