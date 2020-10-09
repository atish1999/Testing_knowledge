package code_forces.Div2C.Level1200;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Hexadecimals_Numbers {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),c=0;
//		Integer.toBinaryString(i) turns the decimal number into its binary form
//		as a string.
		for(int i=1; Integer.parseInt(Integer.toBinaryString(i))<=n; i++) ++c;
		System.out.println(c);
	}
	static void solve(int n) {
		long d=(long)Math.log(n)+1;
		int x=0;
		outer:
			for(int i=0; i<(1<<d); i++) {
				int one=0,zero=0,c=1,ans=0;
				for(int j=0; j<d; j++) {
					if((i&(1<<j))!=0) {
						++one;
						ans+=c*1;
					}else {
						++zero;
						ans+=c*0;
					}
					c*=10;
				}
				if(ans<=n) ++x;
				else break outer;
			}
		System.out.println(x-1);
	}
}
