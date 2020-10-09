package code_forces.Div2A.Level800;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Wrong_Substraction {

	public static void main(String[] args) throws  java.lang.Exception {
	
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
	     int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
	      
	     for(int i=0; i<k; i++){
	           if(n%10==0){
	               n/=10;
	           }else{
	               --n;
	           }
	       }
	       System.out.println(n);
	}

}
