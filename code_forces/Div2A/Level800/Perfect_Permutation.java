package code_forces.Div2A.Level800;

import java.util.*;

public class Perfect_Permutation {

	public static void main(String[] args)  {
	   Scanner  sc = new Scanner (System.in);
		int n = sc.nextInt();
		if(n%2!=0) {
			System.out.println(-1);	
		}else {
			for(int i=2; i<=n; i+=2) {
				System.out.print(i+" "+(i-1)+" ");
			}		
		}	
	}
}
