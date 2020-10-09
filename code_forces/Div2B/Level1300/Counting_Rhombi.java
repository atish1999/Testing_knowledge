package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Counting_Rhombi {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int w=Integer.parseInt(st.nextToken()),h=Integer.parseInt(st.nextToken());
		long c=(long)( Math.floor(w/2.0)*Math.ceil(w/2.0)*Math.floor(h/2.0)* Math.ceil(h/2.0));
		System.out.println(c);
	}

}
