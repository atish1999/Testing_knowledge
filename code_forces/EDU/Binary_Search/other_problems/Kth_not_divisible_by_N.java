package code_forces.EDU.Binary_Search.other_problems;
import java.util.*;
import java.io.*;

public class Kth_not_divisible_by_N {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n=Long.parseLong(st.nextToken()),k=Long.parseLong(st.nextToken());
			long  l=1,r=2*k;
			long res=0;
			while(l<=r) {
				long m=(l+r)>>>1;
//	x=(m/n) means x is the total number of elements up to m which are
//	divisible by n.d=(m-(m/n)) are the number of elements up to m
//	which are not divisible by n ,if d>=k && (m%n)!=0 means 
//	we can take the m th element in result.
//  we have to find this smallest m such that (m-(m/n)<k)	
				if(m-(m/n)>=k) {
					if(m%n!=0) res=m;
					r=m-1;
				}else l=m+1;
			}
			System.out.println(res);
		}
	}
	static void solve() throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n=Long.parseLong(st.nextToken()),k=Long.parseLong(st.nextToken());
/*
	From 1 to N, there are N-1 numbers not divisible by N. 
	In every block of N numbers, N-1 are not divisible by N. 
	So if we want K numbers, there must be at least K/N−1 blocks.
*/
//	if k=97 and n=7 -> (k/(n-1))=(97/6)=16->97=16*6+(97%6)i.e. we need at least 16 blocks
//	means k-th number belongs to (16*7, 17*7)=>{113,114,115,116,117,118}
//	and k-th number=(7*16)+1=113
			long r=n*(k/(n-1))+k%(n-1);
			if(k%(n-1)==0) --r;
			System.out.println(r);
		}
	}
}
