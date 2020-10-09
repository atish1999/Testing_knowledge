package code_forces.Div2.contest;
import java.util.*;
import java.io.*;
public class Subset_Mex {


	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),f[]=new int[101];
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				int a=Integer.parseInt(st.nextToken());
				++f[a];
			}
			int ans=0;
			int pos=-1;
//  the 1st number whose freq is 0 will be the missing element of 1st subset.
			for(int i=0; i<101; i++) if(f[i]==0) {ans+=i;pos=i;break;}
			int i;//x=0;
//	the 1st number whose freq is less than 2 or equal to 1 will be the missing element of 2nd subset		
			for(i=0; i<pos; i++) {
				if(f[i]<2) { //or f[i]==1 both the conditions are right
/*     				x=i;
		    x will give right answer only when there exist a i in[0,pos)
 			for which f[i]<2.
            if all i in[0,pos) have f[i]>2 then x will be giving 0
			in that case misssing number of each of the subsets will be pos.
			thats why we are declaring i as globally. not declaring x.	
*/	
					break;
				}
			}
			System.out.println(ans+i);
		}
    }
	
	static void solve()throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			Map<Integer, Integer> m=new HashMap<>();
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				int a=Integer.parseInt(st.nextToken());
				if(m.containsKey(a)) m.put(a, m.get(a)+1);
				else m.put(a, 1);
			}
			Set<Integer> l1=new HashSet<>(),l2=new HashSet<>();
			for(int x: m.keySet()) {
				if((m.get(x))>=2) {l1.add(x);l2.add(x);}
				else l1.add(x);
			}
		
			int ans=0;
			boolean ok1=false;
			for(int i=0; i<l1.size(); i++) {
				if(!l1.contains(i)) {
					ans+=i;
					ok1=true;
					break;
				}
			}
			if(!ok1) ans=l1.size();
			boolean ok=false;
			for(int i=0; i<l2.size(); i++) {
				if(!l2.contains(i)) {
					ans+=i;
					ok=true;
					break;
				}
			}
			if(!ok)  ans+=l2.size();
			System.out.println(ans);
		}
    }

}
