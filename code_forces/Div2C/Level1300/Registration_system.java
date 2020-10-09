package code_forces.Div2C.Level1300;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Registration_system {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Map<String,Integer> m=new HashMap<>();
		for(int i=0; i<n; i++) {
			String s=br.readLine();
			if(!m.containsKey(s)) {
				System.out.println("OK");
				m.put(s, 0);
			}else {
				m.put(s, m.get(s)+1);
				System.out.println(s+m.get(s));
			}
		}
	}
//	O(N^2)
    static void solve()throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s[]=new String[n],s2[]=new String[n];
		for(int i=0; i<n; i++) {
			s[i]=br.readLine();
		}
		boolean b[]=new boolean[n];
		for(int i=0; i<n; i++) {
			int c=1;
			for(int j=i+1; j<n; j++) {
				if(s[i].equals(s[j]) && !b[j]) {s[j]=s[j]+""+c;++c;b[j]=true;}
			}
		}
		for(int i=0; i<n; i++) if(!b[i]) s[i]="OK";
		for(String e: s) System.out.println(e);
	}
 
}
