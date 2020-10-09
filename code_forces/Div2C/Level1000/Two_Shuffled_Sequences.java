package code_forces.Div2C.Level1000;
import java.util.*;
import java.io.*;
public class Two_Shuffled_Sequences {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		Map<Integer,Integer> m=new HashMap<>();
		for(int i=0; i<n; i++) {
			int a=Integer.parseInt(st.nextToken());
			if(!m.containsKey(a)) m.put(a, 1);
			else m.put(a, m.get(a)+1);
		}
		for(int x: m.keySet()) {
			if(m.get(x)>2) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		List<Integer> a=new ArrayList<>(), b=new ArrayList<>();
		for(int x: m.keySet()) {
			if(m.get(x)==1) {
				a.add(x);
			}else {
				a.add(x);
				b.add(x);
			}
		}
		Collections.sort(a);Collections.sort(b,Collections.reverseOrder());
		System.out.println(a.size());
		for(int x: a) System.out.print(x+" ");
		System.out.println();
		System.out.println(b.size());
		for(int x: b) System.out.print(x+" ");
		
	}

}
