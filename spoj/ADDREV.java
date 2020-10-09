package spoj;

import java.util.Scanner;

public class ADDREV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		while(n-->0) {
			int n1=sc.nextInt(),n2=sc.nextInt();
			int sum=rev(n1)+rev(n2);
			System.out.println(rev(sum));
		}
	}
	static int rev(int n) {
		int r=0;
		while(n!=0) {
			r=r*10+n%10;
			n/=10;
		}
		return r;
	}
}
