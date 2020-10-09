package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class African_Crossword {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		char c[][]=new char[n][m];
		for(int i=0; i<n; i++) {
			String s=br.readLine();
			for(int j=0; j<m; j++) {
				c[i][j]=s.charAt(j);
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				boolean ok=false;
				for(int k=0; k<m; k++) {
					if(c[i][j]==c[i][k] && j!=k) {ok=true;break;}
				}
				if(!ok) {
					for(int k=0; k<n; k++) {
						if(c[i][j]==c[k][j] && i!=k) {ok=true;break;}
					}
				}
				if(!ok) System.out.print(c[i][j]);
			}
		}

	}

}
