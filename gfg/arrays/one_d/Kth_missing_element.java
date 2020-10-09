package gfg.arrays.one_d;

import java.util.Scanner;

public class Kth_missing_element {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
//		    int k=sc.nextInt();
		    int a[]=new int[n1];
		    int b[]=new int[n2]; 
		    
		    for(int i=0; i<n1;i++){
		        a[i]=sc.nextInt();
		    }
		    for(int i=0; i<n2;i++){
		         b[i]=sc.nextInt();
		    }
		    
		   for(int i=0; i<n1; i++) {
			   int c = a[i];
			   boolean isFinding=false;
			   for(int j=0; j<n2; j++) {
				   if(b[j]==a[i]) {
					   isFinding =true;
					   break;
				   }
			   }
			   if(!isFinding) {
				   System.out.print(c+" ");
			   }
		    }
		}
	}
}
