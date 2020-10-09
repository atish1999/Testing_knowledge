package code_forces.Div2C.Level1300;
import java.util.*;
import java.io.*;
public class Summarize_to_the_Power_of_Two {


	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n];
		Map<Integer, Integer> m=new HashMap<>();
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			m.put(a[i], m.getOrDefault(a[i], 0)+1);
		}
		long count=0;
		for(int i=0; i<n; i++) {
			boolean ok=false;
//		as  [2^29 < 10^9 < 2^30] that's why upper limit will be 30;
			for(int j=0; j<=30; j++) {
				int s=(1<<j);
				if(m.containsKey(s-a[i])) {
//		because if there is numer of 2 is 1 and 4-2=2 which is present in that case 
//	    we are applying the following conditions:
					if(m.get(s-a[i])>=2 ||(m.get(s-a[i])==1 && (s-a[i]!=a[i]))) {
						ok=true;break;
					}
				}
			}
			if(!ok) ++count;
		}
		System.out.println(count);
	}
	
	
}
