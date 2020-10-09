package code_forces.Div2A.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Good_Number {

	public static void main(String[] args) throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),c=0;
		while(n-->0) {
			char s[]=br.readLine().toCharArray();
			Set<Character> h=new HashSet<>();
			for(int i=0; i<s.length; i++) h.add(s[i]);
			boolean ok=true;
			for(int i=0; i<=k; ++i) {
				String d=""+i;
				if(!h.contains(d.charAt(0))) {ok=false;break;}
			}
			if(ok) ++c;
		}
		System.out.println(c);
	}

}
