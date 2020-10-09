package code_chef.LunchTime.July_2020;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Maximum_Candies {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n =Long.parseLong(st.nextToken()),m=Long.parseLong(st.nextToken()),
			x=Long.parseLong(st.nextToken()),y=Long.parseLong(st.nextToken()),cell=n*m;
			if(x<=y) {
				if(x<=y/2) System.out.println(cell*x);
				else System.out.println((cell&1)==0?cell/2*y:cell/2*y+x);
			}else {
				if(cell==1) System.out.println(x);
				else System.out.println((cell&1)==0?cell/2*y:cell/2*y+Math.max(y/2, y-y/2));
			}
		}
	}

}
