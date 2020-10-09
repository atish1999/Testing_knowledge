package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Little_Elephant_and_Magic_Square {

	public static void main(String[] args)throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[][]=new int[3][3],sum=0;
		for(int i=0; i<3; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			a[i][0]=Integer.parseInt(s.nextToken());
			a[i][1]=Integer.parseInt(s.nextToken());
			a[i][2]=Integer.parseInt(s.nextToken());
			sum+=a[i][0]+a[i][1]+a[i][2];
		}
		sum/=2;
		a[0][0]=sum-(a[0][1]+a[0][2]);
		a[1][1]=sum-(a[1][0]+a[1][2]);
		a[2][2]=sum-(a[2][0]+a[2][1]);
		for(int[] e:a) {
			for(int c: e) System.out.print(c+" ");
			System.out.println();
		}
	}

}
