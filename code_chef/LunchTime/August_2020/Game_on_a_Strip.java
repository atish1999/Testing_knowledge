package code_chef.LunchTime.August_2020;
import java.util.*;
import java.io.*;
public class Game_on_a_Strip {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0) {
        	int n=Integer.parseInt(br.readLine()),a[]=new int[n];
        	StringTokenizer s = new StringTokenizer(br.readLine());
        	int c=0,max=Integer.MIN_VALUE;
        	List<Integer> l=new ArrayList<>();
        	for(int i=0; i<n; i++) {
        		a[i]=Integer.parseInt(s.nextToken());
        		if(a[i]==1) {
        			if(c>0) {
        				l.add(c);
        				c=0;
        			}
        			continue;
        		}
        		++c;
        	}
        	Collections.sort(l);
        	if(l.size()==0) System.out.println("No");
        	else if(l.size()==1) {
        		System.out.println((l.get(0)&1)==1?"Yes":"No");
        	}else {
        		int n1=l.get(l.size()-1),n2=l.get(l.size()-2);
        		if(n1/2>n2-1 && (n1&1)==1) System.out.println("Yes");
        		else System.out.println("No");
        		}
        	}
        }
	

}
