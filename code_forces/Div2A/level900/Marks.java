package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Marks {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x =Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
		int a[][]=new int[x][y];
		for(int i=0; i<x; i++) {
			String s= br.readLine();
			for(int j=0; j<y; j++) {
				a[i][j]=s.charAt(j)-'0';
			}
		}
		int c=0;
		boolean b[]=new boolean[x];
		for(int j=0; j<y; j++) {
			int max=a[0][j];
			for(int i=1; i<x; i++) {
				if(a[i][j]>max)
					max=a[i][j];
			}
			for(int i=0; i<x; i++) {
				if(a[i][j]==max && !b[i]) {
					b[i]=true;
					++c;
				}
			}
			if(c>=x) {
				c=x;
				break;
			}

		}
		System.out.println(c);

	}
	
	

}
