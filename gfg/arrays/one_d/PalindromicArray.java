package gfg.arrays.one_d;

import java.util.Scanner;

public class PalindromicArray {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int n =sc.nextInt();
		    int a[]=new int[n];
		    boolean sorted=true;
		    for(int i=0; i<n-1; i++){
		        
		        if(a[i]>a[i+1]){
		            sorted = false;
		            break;
		        }
		    }
		    if(sorted){
		        System.out.println(1);
		    }else{
		        System.out.println(0);
		    }
		}
		
	}

}
