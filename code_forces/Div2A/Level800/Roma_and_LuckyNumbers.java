package code_forces.Div2A.Level800;

import java.util.Scanner;

public class Roma_and_LuckyNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[sc.nextInt()],k=sc.nextInt(),c=0;
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++) {	
			if(trace(a[i],k)) {
				++c;
			}
		}
		System.out.println(c);
	}

static boolean trace(int a,int k) {
	int c=0;
	while(a!=0) {
		if(a%10==4 ||a%10== 7 && c<=k)	++c;
		a/=10;
	}
	return(c<=k?true: false);
}

}
