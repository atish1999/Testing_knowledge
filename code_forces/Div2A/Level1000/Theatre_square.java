package code_forces.Div2A.Level1000;
import java.util.*;
import java.io.*;
public class Theatre_square {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		double n=Double.parseDouble(st.nextToken()),m=Double.parseDouble(st.nextToken()),a=Double.parseDouble(st.nextToken());
		System.out.println((long)(Math.ceil(n/a)*Math.ceil(m/a)));

	}

}
