package code_forces.Div2C.Level1200;
import java.util.*;
import java.io.*;
public class Doors_Breaking_and_Repairing {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(s.nextToken()),x=Integer.parseInt(s.nextToken()),y=Integer.parseInt(s.nextToken());
		int a[]=new int[n],c=0;
		s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(s.nextToken());
			if(a[i]<=x) ++c;
		}
		if(x<=y) System.out.println((int)Math.ceil(c/2.0));
		else System.out.println(n);
    }

}
