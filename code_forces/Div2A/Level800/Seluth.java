package code_forces.Div2A.Level800;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Seluth {


	public static void main(String[] args) throws java.lang.Exception {
		 BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        int a[]=new int[n];
	        StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++){
			    a[i]=Integer.parseInt(st.nextToken());
			}
		    int m=position(a);
		    System.out.println(a.length-1+m);

	}
	static int position(int[] arr){
	    int min=arr[0],max=arr[0],x=0,y=0;
	    for(int i=1; i<arr.length; i++){
	        if(arr[i]<=min){
	            min=arr[i];
	            x=i;
	        }
	        if(arr[i]>=max){
	            max=arr[i];
	            y=i;
	        }
	    }
	    return x-y;
	}

}
