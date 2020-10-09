package code_forces.Div2.contest;
import java.util.*;
import java.io.*;
public class Big_Vova {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			List<Integer> a=new ArrayList<>(),b=new ArrayList<>(),c=new ArrayList<>();
			StringTokenizer s = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a.add(Integer.parseInt(s.nextToken()));
			Collections.sort(a, Collections.reverseOrder());
			c.add(a.get(0));
			for(int i=1; i<a.size(); i++) {
				if(a.get(0)%a.get(i)==0) c.add(a.get(i));
				else b.add(a.get(i));
			}
			System.out.println(c+" "+b);
		}
	}
	
}
