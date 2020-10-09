package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Yet_Another_Two_Integers_Problem {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
			if(a<b) {a^=b;b^=a;a^=b;}
			int d=a-b;
			if(d>=10) {
				System.out.println((long)(Math.ceil(d/10.0)));
			}else {
				System.out.println(a==b?0:1);
			}
		}
	}

}
