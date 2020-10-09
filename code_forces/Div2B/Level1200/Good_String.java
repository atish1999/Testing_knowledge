package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Good_String {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			char s[]=br.readLine().toCharArray();
			if(s[0]=='>' || s[n-1]=='<') System.out.println(0);
			else {
				int c1=0;
				for(int i=0; i<n; i++) {
					if(s[i]=='>') break;
					else ++c1;
				}
				int c2=0;
				for(int i=n-1; i>=0; i--) {
					if(s[i]=='<') break;
					else ++c2;
				}
				System.out.println(Math.min(c1,c2));
			}
		}
	}
}
