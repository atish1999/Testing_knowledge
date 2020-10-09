package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Detective_Book {

	public static void main(String[] args) throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count=0,e=0;
		for(int i=1; i<=n; i++) {
			a=Integer.parseInt(st.nextToken());
			e=Math.max(e, a);
			if(e==i) ++count;
		}
		System.out.println(count);
	}

}
