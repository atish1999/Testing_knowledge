package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Contest {

	public static void main(String[] args) throws java.lang.Exception
    {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a[]=new int[4],x=0;
		while(x<4) { a[x]=Integer.parseInt(st.nextToken());++x; }
		int m=Math.max((3*a[0])/10, a[0]-(a[0]/250*a[2]) );
		int v=Math.max((3*a[1])/10, a[1]-(a[1]/250)*a[3] );
		if(m==v) System.out.println("Tie");
		else System.out.println(m>v?"Misha":"Vasya");
	}

}
