package code_forces.Div2C.Level1200;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Less_or_Equal {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
		List<Integer> a=new ArrayList<>();
		a.add(1);
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(a);
		System.out.println((k==n||a.get(k)<a.get(k+1))?a.get(k):-1);
	}

}
