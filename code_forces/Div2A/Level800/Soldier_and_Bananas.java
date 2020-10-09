package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Soldier_and_Bananas {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int k=Integer.parseInt(s1.nextToken()),n=Integer.parseInt(s1.nextToken()),w=Integer.parseInt(s1.nextToken());
		int cost=(w*(k+k*w))/2;
		System.out.println(cost>n?cost-n:0);
	}

}
