package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Paralellepiped {

	public static void main(String[] args)throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer s = new StringTokenizer(br.readLine());
	    int x=Integer.parseInt(s.nextToken()),y=Integer.parseInt(s.nextToken()),z=Integer.parseInt(s.nextToken());
	    /*a=((int) Math.sqrt((x*z)/y))
	     * b=((int) Math.sqrt((x*y)/z)),c=((int) Math.sqrt((y*z)/x)))
	     * */
	    System.out.println(4*(((int) Math.sqrt((x*z)/y))+((int) Math.sqrt((x*y)/z))+((int) Math.sqrt((y*z)/x))));
	}

}
