package code_forces.Div2.Educational_round;
import java.util.*;
import java.io.*;
public class Mortal_Kombat_Tower {

	public static void main(String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	    	int n=Integer.parseInt(br.readLine()),a[]=new int[n];
	    	StringTokenizer st=new StringTokenizer(br.readLine());
	    	for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
	    	int ans=a[0];// if(a[0]=1, then skip point would be 1 otherwise 0)
	    	int point=0;
/*
	lets add the first number to the answer and 
	then we have choice of changing turns 
	so from there onwards lets say we have x number of consecutive 1's 
	then the answer for that will be x/3 
	(eg for x=5 we can have the 1st two one by us 
	then one cost of skip by our friend and last two 1's by us again giving 5/3=1) 
	and then again after reaching 0 or end we have choice of changing turn
*/
	    	for(int i=1; i<n; i++) {
	    		if(a[i]==0) {
	    			ans+=(point/3);
	    			point=0;
	    			continue;
	    		}
	    		++point;
	    	}
	    	ans+=point/3;
	    	System.out.println(ans);
	    }

	}

}
