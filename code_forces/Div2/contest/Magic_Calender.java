package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Magic_Calender {
	
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n=Long.parseLong(st.nextToken()),r=Long.parseLong(st.nextToken());
			//when(n>r) then for each value of r , r valid shapes.
			//otherwise there will be 1 valid shapes because for r>=n
			// there will be 1 common shape...
			System.out.println(n>r?(r*(r+1))/2 : ((n*(n-1))/2)+1);
		}
	}

}
