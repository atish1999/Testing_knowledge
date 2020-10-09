package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Equalize_prices_Again {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q=Integer.parseInt(br.readLine());
		while(q-->0) {
			int n=Integer.parseInt(br.readLine()),a=0,c=n;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(c-->0) {	
				a+=Integer.parseInt(st.nextToken());
				
			}
			int d=a/n;
			System.out.println(n*d<a?++d:d);
		}

	}

}
