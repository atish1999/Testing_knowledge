package code_forces.Div2A.Level800;
import java.io.*;
import java.util.*;
public class Choosing_Teams {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
		StringTokenizer s = new StringTokenizer(br.readLine());
		int a[]=new int[n],count=0;
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(s.nextToken());
			if(5-a[i]>=k) ++count;
		}
		System.out.println(count/3);

	}

}
