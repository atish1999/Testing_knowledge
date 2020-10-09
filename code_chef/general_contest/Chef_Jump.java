package code_chef.general_contest;
import java.util.*;
import java.io.*;
public class Chef_Jump {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			String s=br.readLine();
			double h=Double.parseDouble(s.substring(0, 2)),m=Double.parseDouble(s.substring(3));
			h=h>12?h-12:h;
			double angle=Math.abs((h*30)+m/2-(m*6));
			angle=Math.min(angle, 360-angle);
			System.out.println(angle==(int)angle?(int) angle+" degree":angle+" degree");
		}
	}

}
