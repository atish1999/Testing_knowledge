package code_chef.dsaLearningSeries.contest1;

import java.util.*;

public class Factorial {

	public static void main(String[] args)  {
		Scanner sc = new Scanner (System.in);
		int m =sc.nextInt();
		while(m-->0) {
			int n =sc.nextInt(),z=0;
			while(n>=5) {
				z+=n/5;
				n/=5;
			}
			System.out.println(z);
		}

	}

}
