package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Decrease_the_Sum_of_Digits {

	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String s1=st.nextToken();int s=Integer.parseInt(st.nextToken());
			int sum=0;
			for(int i=0; i<s1.length(); i++) {
				sum+=s1.charAt(i)-48;
			}
			if(sum<=s) {System.out.println(0);}
			else {
				int x=s1.charAt(0)-48;
				if(x<s) {
					String s2=5+"0".repeat(s1.length());
					System.out.println(Long.parseLong(s2)-Long.parseLong(s1));
				}else {
					String s2=1+"0".repeat(s1.length());
					System.out.println(Long.parseLong(s2)-Long.parseLong(s1));
				}
			}
			
		}

	}

}
