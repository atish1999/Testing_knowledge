package code_chef.game_theory;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Tseries_vs_pewdipie {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n =Long.parseLong(st.nextToken()); String p=st.nextToken();
			System.out.println((n&1)==0?p.equals("T")?"T-Series":"PewDiePie":p.equals("P")?"T-Series":"PewDiePie");
		}
	}

}
