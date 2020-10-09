package code_forces.Div2.Educational_round;
import java.util.*;
import java.io.*;
public class Negative_Prefixes {

	public static void main(String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	    	int n=Integer.parseInt(br.readLine()),a[]=new int[n],b[]=new int[n];
	    	StringTokenizer st=new StringTokenizer(br.readLine());
	    	StringTokenizer s=new StringTokenizer(br.readLine());
	    	List<Integer> l=new ArrayList<>();
	    	for(int i=0; i<n; i++) {
	    		a[i]=Integer.parseInt(st.nextToken());
	    		b[i]=Integer.parseInt(s.nextToken());
	    		if(b[i]==0) l.add(a[i]);
	    	}
	    	Collections.sort(l, Collections.reverseOrder());
	    	int idx=0;
	    	for(int i=0; i<n; i++) {
	    		if(b[i]==1) System.out.print(a[i]+" ");
	    		else {
	    			System.out.print(l.get(idx)+" ");
	    			++idx;
	    		}
	    	}
	    	System.out.println();
	    }

	}
	

}
