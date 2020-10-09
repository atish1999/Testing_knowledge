package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Combination {

	public static void main(String[] args)throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(br.readLine()),a[]=new int[n],b[]=new int[n];
	    int count=1,points=0;
	    for(int i=0; i<n; i++) {
	    	StringTokenizer s = new StringTokenizer(br.readLine());
	    	a[i]=Integer.parseInt(s.nextToken());b[i]=Integer.parseInt(s.nextToken());
	    	if(b[i]>0) {
	    		points+=a[i];
	    		count+=(b[i]-1);
	    	}
	    }
	    List<Integer> l=new ArrayList<>();
	    for(int i=0; i<n; i++) if(b[i]==0) l.add(a[i]);
	    Collections.sort(l, Collections.reverseOrder());
	    for(int i=0; i<l.size(); i++) {
	    	if(count!=0) {
	    		points+=l.get(i);
	    		--count;
	    	}else break;
	    }
	    System.out.println(points);
	}

}
