package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Restore_permutation {

	public static void main(String[] args)throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			List<Integer> a=new ArrayList<>(),p=new ArrayList<>();
			int n=Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<2*n; i++) {
				a.add(Integer.parseInt(st.nextToken()));
				if(!p.contains(a.get(i))) p.add(a.get(i));
			}
			for(int e: p) System.out.print(e+" ");
			System.out.println();
			
		}

	}

}
