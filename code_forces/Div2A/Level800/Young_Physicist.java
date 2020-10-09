package code_forces.Div2A.Level800;

import java.util.Scanner;

public class Young_Physicist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=0,y=0,z=0;
		while(n-->0) {
			x+=sc.nextInt();
			y+=sc.nextInt();
			z+=sc.nextInt();
		}
		System.out.println(x==0&&y==0&&z==0?"YES":"NO");
		
	}

}
