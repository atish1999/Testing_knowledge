package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Fillya_and_Homework {

	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		Set<Integer> h=new TreeSet<>();
		for(int i=0; i<n; i++) {
			int a=Integer.parseInt(st.nextToken());
			h.add(a);
		}
		boolean ok=false;
		if(h.size()<=2) ok=true;
		else if(h.size()==3) {
			int num[]= {((TreeSet<Integer>) h).pollFirst(),((TreeSet<Integer>) h).pollFirst(),((TreeSet<Integer>) h).pollFirst()};
			if(num[1]-num[0]==num[2]-num[1]) ok=true;
			else ok=false;
		}
		System.out.println(ok?"YES":"NO");
	}
}
