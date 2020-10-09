package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Vanya_and_fence {

	public static void main(String[] args) throws java.lang.Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),h=Integer.parseInt(st.nextToken());
		StringTokenizer s = new StringTokenizer(br.readLine());  
		int a[]=new int[n],c=0;
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(s.nextToken());
			if(a[i]>h) ++c;
		}

		System.out.println(c*2+(n-c));
	}

}
