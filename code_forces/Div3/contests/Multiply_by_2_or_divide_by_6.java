package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Multiply_by_2_or_divide_by_6 {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			long n =Long.parseLong(br.readLine());
			if(n==1) {
				System.out.println(0);
				continue;
			}
			int ans=0;
			while(n>=3) {
				if(n%6==0 && n/6>=3) {
					n/=6;++ans;
				}
				else if(n==6) {
					++ans;break;
				}else if(n==3) {
					ans+=2;break;
				}else {
					n*=2;
					++ans;
				}
			}
//			System.out.println(n);
			System.out.println(n==6||n==3?ans:-1);
		}
	}

}
