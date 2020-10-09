package code_chef.LunchTime.July_2020;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Chef_and_steps {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n=Long.parseLong(st.nextToken()),k=Long.parseLong(st.nextToken());
			while(n-->0) {
				long d=Long.parseLong(br.readLine());
				System.out.print(d%k==0?1:0);
			}
			System.out.println();
		}
	}

}
