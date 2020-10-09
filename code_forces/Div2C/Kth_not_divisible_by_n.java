package code_forces.Div2C;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Kth_not_divisible_by_n {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x =Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
			System.out.println(y+(y-1)/(x-1));
		}
	}

}
