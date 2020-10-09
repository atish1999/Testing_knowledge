package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Valera_and_antique {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n=Long.parseLong(st.nextToken()),v=Long.parseLong(st.nextToken());
		int c=0;
		List<Integer> l=new ArrayList<>();
		while(n-->0) {
			long min=Long.MAX_VALUE;
			StringTokenizer s = new StringTokenizer(br.readLine());
			long x=Long.parseLong(s.nextToken());
			while(x-->0) {
				long y = Long.parseLong(s.nextToken());
				min=Math.min(min, y);
			}
			++c;
			if(v>min) l.add(c);
		}
		System.out.println(l.size());
		for(int i=0; i<l.size(); ++i) {
			System.out.print(l.get(i)+" ");
		}
	}

}
