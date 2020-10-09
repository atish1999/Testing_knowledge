package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Anton_and_classes {

	public static void main(String[] args) throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),min1=Integer.MAX_VALUE,max2=0;
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l=Integer.parseInt(st.nextToken()),r=Integer.parseInt(st.nextToken());
			min1=Math.min(min1, r);max2=Math.max(max2, l);
		}
		int m=Integer.parseInt(br.readLine()),max1=0,min2=Integer.MAX_VALUE;
		while(m-->0) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int l=Integer.parseInt(s.nextToken()),r=Integer.parseInt(s.nextToken());
			max1=Math.max(max1, l);min2=Math.min(min2, r);
		}
		int d1=min1>max1?0:max1-min1,d2=min2>max2?0:max2-min2;
		System.out.println(d2>d1?d2:d1);
	}

}
