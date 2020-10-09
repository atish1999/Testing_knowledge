package code_forces.Div2A.Level800;
import java.io.*;
import java.util.*;
public class Fox_and_Snake {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
        char a[][]=new char[n][m];int k=0,l=0;
        for(int i=0; i<n; i++) {
        	for(int j=0; j<m; j++) {
        		if(i%2==0) { a[i][j]='#';}
        		else {	
        			if(j==m-1 && i==(1+k)) {
        				a[i][j]='#';
        				k+=4;				
        			}else if(j==0 && i==(3+l)) {
        				a[i][j]='#';l+=4;
        			}else {
        				a[i][j]='.';
        		    }
        		}
        	}
        }
        for(char[] in: a) {
        	for(char c: in) {
        		System.out.print(c);
        	}
        	System.out.println();
        }

	}

}
