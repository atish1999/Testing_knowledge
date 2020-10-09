package code_chef.Long_challenge.July_2020;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Missing_points {

	public static void main(String[] args) throws java.lang.Exception
	{		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t =Integer.parseInt(br.readLine());
			while(t-->0) {
				long n=Long.parseLong(br.readLine());
				List<Long> x=new ArrayList<>(),y=new ArrayList<>();
				for(long i=0; i<4*n-1; i++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					x.add(Long.parseLong(st.nextToken()));
					y.add(Long.parseLong(st.nextToken()));
				}
				Collections.sort(x);Collections.sort(y);
				long x1=0,y1=0;
				for(int i=0; i<x.size(); i++) x1^=x.get(i);
				for(int i=0; i<y.size(); i++) y1^=y.get(i);
				System.out.println(x1+" "+y1);
			}
	}
}
