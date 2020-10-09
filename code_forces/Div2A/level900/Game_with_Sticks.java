package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Game_with_Sticks {

	public static void main(String[] args) throws java.lang.Exception
    {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		int min=Math.min(n, m);
		System.out.println(min%2==0?"Malvika":"Akshat");
	}

}
