package code_forces.Div2A.Level800;
import java.util.*;
import java.lang.*;
import java.io.*;
public class I_love_username {

	public static void main(String[] args)throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(br.readLine()),a[]=new int[n];
	    StringTokenizer s = new StringTokenizer(br.readLine());
	    for(int i=0; i<n; ++i) a[i]=Integer.parseInt(s.nextToken());
	    int min=a[0],max=a[0],count=0;
	    for(int i=1; i<n; i++) {
	    	if(a[i]<min) {
	    		min=a[i];
	    		++count;
	    	}else if(a[i]>max) {
	    		max=a[i];
	    		++count;
	    	}
	    }
	    System.out.println(count);
	}

}
