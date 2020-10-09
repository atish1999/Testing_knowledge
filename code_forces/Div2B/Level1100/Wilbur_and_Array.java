package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Wilbur_and_Array {

	public static void main(String[] args) throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),b[]=new int[n];long ans=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			b[i]=Integer.parseInt(st.nextToken());
			if(i>0) ans+=Math.abs(b[i]-b[i-1]);
			else ans+=Math.abs(b[i]);
		}
		System.out.println(ans);
	}

}
