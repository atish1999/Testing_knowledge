package code_forces.Div2B.Level800_900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Sale {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),
			a[]=new int[n],sum=0,c=0;
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
		Arrays.sort(a);
	    for(int i=0; i<n; i++) {
	    	if(a[i]<0 && c<k) {
	    		sum+=a[i];
	    		++c;
	    	}else break;
	    }
	    System.out.println(Math.abs(sum));
		
	}

}
