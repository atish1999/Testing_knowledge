package code_chef.Long_challenge.August_2020;
import java.util.*;
import java.io.*;
public class Another_Card_Game_Problem {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0){
			StringTokenizer s = new StringTokenizer(br.readLine());
			long c=Long.parseLong(s.nextToken()),r=Long.parseLong(s.nextToken());
			if(c/9<r/9) {
				long d=0;
				d=c%9==0?c/9:c/9+1;
				System.out.println(0+" "+d);
			}else {
				long d=0;
				d=r%9==0?r/9:r/9+1;
				System.out.println(1+" "+d);
			}
		}
	}

}
