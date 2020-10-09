package errichto;

import java.util.Arrays;

public class BinarySearch {
 
	public static void main(String[] args) {

		int a[]= {-9,9,8,0,4,7,-69,-74};
		Arrays.sort(a);
//		for(int e: a) {
//			System.out.print(e+" ");
//		}
		int i=0,j=a.length-1,x=8,ans=-1;
		while(i<=j) {
			int mid=i+(j-i)/2;
			if(a[mid]>x) {
				j=mid-1;
			}else if(a[mid]<x) {
				i = mid+1;
			}else {
				ans=mid;
				break;
			}
		}
		
		System.out.println(ans);
	}

}
