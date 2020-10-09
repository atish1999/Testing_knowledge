package code_forces.Div2C.Level1200;
import java.util.*;
import java.io.*;
public class Balanced_Team {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
//		int a[]=new int[n];
		List<Integer> l=new ArrayList<>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			//a[i]=Integer.parseInt(s.nextToken());
			l.add(Integer.parseInt(s.nextToken()));
		}
//		Arrays.sort(a);
//		conclusion:
//				   if we use arraylist instead of array then there will be mno TLE.
//		i.e. by using Collections.sort(l) there will be no TLE
		Collections.sort(l);
		int j=0,max=0;
		for(int i=0; i<n; i++) {
			while(j<n && l.get(j)-l.get(i)<=5) {
				++j;
				max=Math.max(max, j-i);
			}
		}
		System.out.println(max);
	}
	static void solve1()throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
		sort(a);
		int j=0,max=0;
		for(int i=0; i<n; i++) {
			while(j<n && a[j]-a[i]<=5) {
				++j;
				max=Math.max(max, j-i);
			}
		}
		System.out.println(max);
	}
	static void sort(int[]a) {
		Queue<Integer> q=new PriorityQueue<>();
		for(int i=0; i<a.length; i++) q.add(a[i]);
		for(int i=0; i<a.length; i++) a[i]=q.poll();
	}

}
