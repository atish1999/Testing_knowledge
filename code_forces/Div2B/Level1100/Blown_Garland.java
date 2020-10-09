package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Blown_Garland {

	public static void main(String[] args) throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int r=s.indexOf('R'),b=s.indexOf('B'),g=s.indexOf('G'),y=s.indexOf('Y'),n=s.length();
		int R=r,B=b,G=g,Y=y,c1=0,c2=0,c3=0,c4=0;
		while(r+4<n) {
			if(s.charAt(r+4)=='!') ++c1;
			r+=4;
		}
		while(R-4>=0) {
			if(s.charAt(R-4)=='!') ++c1;
			R-=4;
		}
		while(b+4<n) {
			if(s.charAt(b+4)=='!') ++c2;
			b+=4;
		}
		while(B-4>=0) {
			if(s.charAt(B-4)=='!') ++c2;
			B-=4;
		}
		while(y+4<n) {
			if(s.charAt(y+4)=='!') ++c3;
			y+=4;
		}
		while(Y-4>=0) {
			if(s.charAt(Y-4)=='!') ++c3;
			Y-=4;
		}
		while(g+4<n) {
			if(s.charAt(g+4)=='!') ++c4;
			g+=4;
		}
		while(G-4>=0) {
			if(s.charAt(G-4)=='!') ++c4;
			G-=4;
		}
		System.out.println(c1+" "+c2+" "+c3+" "+c4);
		
	}

}
