package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Two_array_and_swaps {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),sum=0;	
			List<Integer> a=new ArrayList<>(),b=new ArrayList<>();
			StringTokenizer s = new StringTokenizer(br.readLine());
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				a.add(Integer.parseInt(s.nextToken()));
				b.add(Integer.parseInt(s1.nextToken()));
				sum+=a.get(i);
			}
			Collections.sort(a);Collections.sort(b, Collections.reverseOrder());
			int i=0;
			while(i<k) {
				if(a.get(i)<b.get(i))
					sum+=b.get(i)-a.get(i);
				++i;
			}
			System.out.println(sum);
		}
	}

}
