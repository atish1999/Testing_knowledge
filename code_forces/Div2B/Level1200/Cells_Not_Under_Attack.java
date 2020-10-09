package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Cells_Not_Under_Attack {

	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		long n=Long.parseLong(st.nextToken()),m=Long.parseLong(st.nextToken());
		Set<Long> x=new HashSet<>(),y=new HashSet<>();
		while(m-->0) {
			st=new StringTokenizer(br.readLine());
			long a=Long.parseLong(st.nextToken()),b=Long.parseLong(st.nextToken());
			x.add(a);y.add(b);
			System.out.print((n-x.size())*(n-y.size())+" ");
		}
	}

}
