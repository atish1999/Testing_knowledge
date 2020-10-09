package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Collecting_beats_is_fun {

	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int p[][] = new int[4][4];
		for(int i=0; i<4; i++) {
			String s=br.readLine();
			for(int j=0; j<4; j++) {
				p[i][j]=(s.charAt(j))-48;
			}
		}
		int c[] =new int[10];
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(p[i][j]==-2) continue;
				else ++c[p[i][j]];
			}
		}
		boolean q=true;
		for(int i=0; i<c.length; ++i ) {
			if(c[i]>2*n) {
				q=false;
				System.out.println("NO");
				break;
			}
		}
		if(q) System.out.println("YES");
	}
}
