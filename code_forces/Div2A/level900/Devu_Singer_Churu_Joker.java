package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Devu_Singer_Churu_Joker {

	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),d=Integer.parseInt(st.nextToken());
		int a[]=new int[n],t=0;
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(s.nextToken());
			t+=a[i];
		}
		int c=t+(n-1)*10;
		System.out.println(c<=d? 2*(n-1)+((d-c)/5) : -1);
	}

}
