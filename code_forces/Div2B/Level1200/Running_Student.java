package code_forces.Div2B.Level1200;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Running_Student {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringTokenizer s1=new StringTokenizer(br.readLine());
		StringTokenizer s2=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),vb=Integer.parseInt(st.nextToken()),vs=Integer.parseInt(st.nextToken());
		int xu=Integer.parseInt(s2.nextToken()),yu=Integer.parseInt(s2.nextToken());
		double a[]=new double[n];
		for(int i=0; i<n ; i++) a[i]=Double.parseDouble(s1.nextToken());
		int position=2;
		double min=Math.sqrt((xu-a[1])*(xu-a[1])+yu*yu)/vs+a[1]/vb;
		for(int i=2; i<n; i++) {
			double d1=Math.sqrt((xu-a[i])*(xu-a[i])+yu*yu);
			if(d1/vs+a[i]/vb<=min) {min=d1/vs+a[i]/vb;position=i+1;}
		}
		System.out.println(position);
	}
}
