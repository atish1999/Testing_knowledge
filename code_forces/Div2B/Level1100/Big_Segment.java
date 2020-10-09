package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Big_Segment {

	public static void main(String[] args)throws java.lang.Exception {		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(br.readLine()),a[][]=new int[n][2];
			int min=Integer.MAX_VALUE,max=0,position=-1;
			for(int i=0; i<n; i++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				a[i][0]=Integer.parseInt(s.nextToken());
				a[i][1]=Integer.parseInt(s.nextToken());
				min=Math.min(min, a[i][0]);
				max=Math.max(max, a[i][1]);
			}
		
		    for(int i=0; i<n; i++) {
		    	if(a[i][0]==min && a[i][1]==max) {
		    		position=i+1;
		    		break;
		    	}
		    }
		    System.out.println(position);
	}

}
