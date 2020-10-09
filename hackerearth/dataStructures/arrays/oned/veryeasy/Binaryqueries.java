package hackerearth.dataStructures.arrays.oned.veryeasy;

import java.util.*;


public class Binaryqueries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int[] a = {1,0,1,0,0};
		int n =a.length;
		int index = 0 ;
		if(x<=n) {
			a[x-1]++;
			int L=sc.nextInt(),R =sc.nextInt();
			if(R<=n) {
				int[] b =Arrays.copyOfRange(a, L-1, R);
				for(int e: b) {
					System.out.print(e+" ");
				}
				System.out.println();
				for(int i=1; i<n; i++) {
					if(i==L) {
					 index = R-i;
					 break;
					}
			    }
				if(b[index]==1) {
					System.out.println("ODD");
				}else {
					System.out.println("EVEN");
				}
			}
		}
			
	}
}