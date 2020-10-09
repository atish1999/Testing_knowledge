package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Partition {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		Vector<Integer> B=new Vector<>(),C=new Vector<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n-->0) {
			int a=Integer.parseInt(st.nextToken());
			if(a>=0) B.add(a);
			else C.add(a);
		}
		int sum1=0,sum2=0;
		for(int i=0; i<B.size(); i++) sum1+=B.get(i);
		for(int i=0; i<C.size(); i++) sum2+=C.get(i);
		System.out.println(sum1-sum2);
	}

}
