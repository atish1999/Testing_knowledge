package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Fix_You {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int r=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());
			char a[][]=new char[r][c];
			for(int i=0; i<r; i++) {
				String s=br.readLine();
				for(int j=0; j<c; j++) {
					a[i][j]=s.charAt(j);
				}
			}
			int count=0;
			for(int i=0; i<r-1; i++) if(a[i][c-1]=='R') ++count;
			for(int i=0; i<c-1; i++) if(a[r-1][i]=='D') ++count;
			System.out.println(count);
		}

	}

}
