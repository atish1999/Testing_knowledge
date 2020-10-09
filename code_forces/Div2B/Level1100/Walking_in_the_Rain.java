package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Walking_in_the_Rain {

	public static void main(String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(br.readLine()),a[]=new int[n];
	    StringTokenizer st =new StringTokenizer(br.readLine());
	    int min=Integer.MAX_VALUE;
	    for(int i=0; i<n; i++) {
	    	a[i]=Integer.parseInt(st.nextToken());
	    	if(a[i]<=min) min=a[i];
	    }
	    if(min==a[0] || min==a[n-1]) System.out.println(min);
	    else {
	    	int days=Math.min(a[0], a[n-1]);
	    	for(int i=1; i<n-1; i++) days=Math.min(days, Math.max(a[i], a[i+1]));
	    	System.out.println(days);
	    }
	 
	}

}
