package code_forces.Div2C.Level1100;
import java.util.*;
import java.io.*;
public class Frog_Jumps {

	public static void main(String[] args) throws java.lang.Exception
    {	
//		m-1
//		we can find out farthest 2R's and print the difference in their positions
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			char s[]=br.readLine().toCharArray();
			int n=s.length;
			List<Integer> l=new ArrayList<>();
			l.add(0);
			for(int i=0; i<n; i++) {
				if(s[i]=='R') l.add(i+1);
			}
			l.add(n+1);
			int d=0;
			for(int i=0; i<l.size()-1; i++) {
				d=Math.max(d, (l.get(i+1)-l.get(i)));
			}
			System.out.println(d);
		}
	}
//	m-2
//	calculate the longest L subsequence+1 because that distance frog has to jump
//	to reach to next R or to reach to n+1.
	 static void solve()throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			char s[]=br.readLine().toCharArray();
			int c=0,max=0;
			for(int i=0; i<s.length; i++) {
				if(s[i]=='R') {
					max=Math.max(max, c);
					c=0;
					continue;
				}
				++c;
			}
			max=Math.max(max, c);
			System.out.println(max+1);
		}
    }
}
