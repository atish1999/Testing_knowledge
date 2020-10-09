package code_forces.EDU.Binary_Search.other_problems;
import java.util.*;
import java.io.*;
public class Perfect_Team_C1200 {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			long c=Long.parseLong(st.nextToken()),m=Long.parseLong(st.nextToken()),
				x=Long.parseLong(st.nextToken());
//			System.out.println(solve2(c,m,x));
			solve1(c,m,x);
		}
	}
	static long solve2(long c, long m, long x) {//O(log(MAX))
		long tot=c+m+x;
		long l=0,r=Math.min(c, m);//The resource with 
//		minimal availability (either c or m) defines 
//		an upper bound for the number of perfect teams
//		(which is not necessarily the same as the number of perfect teams).
		long ans=0;
		while(l<=r) {
			long mid=(l+r)>>>1;
/*  If mid teams are formed, then mid coders are already taken 
	and mid mathematicians are also taken. 
	That leaves us with (c−mid)+(m−mid)+x people 
	to fill the empty spot in each of the mid teams. 
	So if that condition if true, 
	then there are enough people to form at least mid teams.
*/			if(tot-2*mid>=mid) {//tot=c+m+x;
				ans=mid;
				l=mid+1;
			}else r=mid-1;
		}
		return ans;
	}
	static void solve(long c, long m, long x) { //O(1)
		long min1=Math.min(c, m);
		long min2=(c+m+x)/3;
		long ans=Math.min(min1, min2);
		System.out.println(ans);
	}
	static void solve1(long c, long m, long x) { //O(1)
		long d=Math.abs(c-m);
		x+=d;
		if(c>m)  c-=d;
		else m-=d;
		long ans=Math.min(c, Math.min(m, x));
		c-=ans;
		m-=ans;
		x-=ans;
		ans+=(c+m)/3;
//		System.out.println(c+" "+m+" "+x);
		System.out.println(ans);
	}
	

}
