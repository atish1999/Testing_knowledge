package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Coins {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());	
		solve(n);
	}
	static void solve(int n) {
		for(int i=n; i>=1; i--) {
			if(n%i==0) {
				System.out.print(i+" ");
				n=i;
			}
		}
	}
	static void solve1(int n) {
		while(n%2==0) {
			System.out.print(n+" ");
			n/=2;
		}
		for(int i=3; i<=n; i+=2) {
			if(n%i==0) {
				while(n%i==0) {
					System.out.print(n+" ");
					n/=i;
				}
			}
		}
		System.out.print(1);
	}
}
