package code_chef.ICPC_online_round_2019;
import java.util.*;
import java.io.*;
public class Discount_in_a_Shop {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			String s=br.readLine();
			long min=Integer.MAX_VALUE;
			for(int i=0; i<s.length(); i++) {
				long x=Long.parseLong(s.substring(0, i)+s.substring(i+1));
				min=Math.min(min, x);
				if(min==0) break;
			}
			System.out.println(min);
		}
	}

}
