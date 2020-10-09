package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Broken_Keyboard {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			List<Character> l =new ArrayList<>();
			char s[]= br.readLine().toCharArray();
			int i=0,n=s.length;
			while(i<n) {
				int j=i;
				while(i<n && j<n && s[j]==s[i]) ++j;
				if((j-i)%2==1 && !l.contains(s[i])) l.add(s[i]);
				i=j;
			}
			Collections.sort(l);
			for(char e : l) System.out.print(e);
			System.out.println();
		}

	}

}
