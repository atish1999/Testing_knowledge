package CSES.Introductory_problems;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Number_Spiral {

	public static void main(String[] args) throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[][]= {{1,2,9,10,25},{4,3,8,11,24},{5,6,7,12,23},{16,15,14,13,22},{17,18,19,20,21}};
		int  t =Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x =Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
			System.out.println(a[x-1][y-1]);
		}
	}

}


