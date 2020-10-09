package code_chef.LunchTime.August_2020;
import java.util.*;
import java.io.*;
public class Mode_of_Frequencies {


	public static void main(String[] args)throws java.lang.Exception  
	{
		solve();
	}
	static void solve() throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0) {
        	int n=Integer.parseInt(br.readLine());
        	Map<Integer,Integer> m=new TreeMap<>(),h=new TreeMap<>();
        	StringTokenizer s = new StringTokenizer(br.readLine());
        	for(int i=0; i<n; i++) {
        		int a=Integer.parseInt(s.nextToken());
        		if(!m.containsKey(a)) m.put(a, 1);
        		else m.put(a, m.get(a)+1);
        	}
        	for(int x: m.keySet()) {
        		if(!h.containsKey(m.get(x))) h.put(m.get(x), 1);
        		else h.put(m.get(x), h.get(m.get(x))+1);
        	}
        	int ans=Integer.MAX_VALUE,max=Integer.MIN_VALUE;        	
        	for(int x: h.keySet()) {
        		if(h.get(x)>max) {
        			max=h.get(x);
        			ans=x;
        		}
        	}
        	System.out.println(ans);
        }
	}
	static void solve1() throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0) {
        	int n=Integer.parseInt(br.readLine()),f[]=new int[11];
        	StringTokenizer s = new StringTokenizer(br.readLine());
        	for(int i=0; i<n; i++) {
        		int a=Integer.parseInt(s.nextToken());
        		++f[a];
        	}
        	int f1[]=new int[(int) (1e4+1)];
        	int max=Integer.MIN_VALUE,ans=0;
        	for(int i=1; i<=10; i++) {
        		++f1[f[i]];
        	}
        	for(int i=1; i<f1.length; i++) max=Math.max(max, f1[i]);
        	for(int i=1; i<f1.length; i++) {
        		if(max==f1[i]) {
        			ans=i;
        			break;
        		}
        	}
        	System.out.println(ans);
        }
	}

}
