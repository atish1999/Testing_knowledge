package code_forces.Div2.Educational_round;
import java.util.*;
import java.lang.*;
import java.io.*;
public class LCM_Problem {
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			 StringTokenizer st =new StringTokenizer(br.readLine());
			 int l=Integer.parseInt(st.nextToken()),r=Integer.parseInt(st.nextToken());
			 if(2*l<=r) System.out.println(l+" "+2*l);
			 else System.out.println(-1+" "+(-1));
		}
		 
	}
	
	

}
