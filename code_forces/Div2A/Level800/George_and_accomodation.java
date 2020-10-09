package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class George_and_accomodation {

	public static void main(String[] args) throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),c=0;
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p=Integer.parseInt(st.nextToken()),q=Integer.parseInt(st.nextToken());
			if(q-p>=2) ++c;
		}
		System.out.println(c);
	}

}
