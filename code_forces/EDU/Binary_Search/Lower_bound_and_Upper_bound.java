package code_forces.EDU.Binary_Search;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Lower_bound_and_Upper_bound {

	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
	    int n=Integer.parseInt(s.nextToken()),x=Integer.parseInt(s.nextToken()),a[]=new int[n];
	    s = new StringTokenizer(br.readLine());
	    for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
	    Arrays.sort(a);// Array should be sorted. otherwise lb and ub cant be calculated
	    int lb=Arrays.binarySearch(a,x);
	    int ub=Arrays.binarySearch(a,x);
//	    System.out.println(lb+" "+ub);
//		{#case-1}
//	    if the number is not present both lower bound and upper bound would be
//	    same .i.e. in that case lb and ub would be the insertion point of the array 
//	    i.e. that point where number should be inserted to keep the array sorted.
//	    Example-1:
/*			6 1
			2 3 4 5 6 7  here lb=0 and ub=0 (0 is the position where 1 should be inserted to keep the array sorted)
 			6 8
			2 3 4 5 6 7	 here lb=6 and ub=6 (6 is the position where 8 should be inserted to keep the array sorted)
 			6 3
			1 2 2 2 4 5	 here lb=4 and ub=4 (4 is the position where 3 should be inserted to keep the array sorted)
 
 		{#case-2(a)}
 		if the number is present and have frequency 1. i.e. number of occurrence is 1
 		lb=index of that number
 		ub=index of the next number which is just greater than that number in the array
 		.i.e. ub=index of that number+1
 		Example-2:
 		6 5
		1 2 3 4 5 6 here lb=4 and ub=5
		{#case-2(b)}
		if the number is present and have frequency more than 1.
		number is occured multiple times.in this case 
		lb would be the index of the 1st occurrence of that number.
		ub would be the index of the last occurrence of that number+1.
		i.e. index of that number which is just greater than the key in the array.
		Example-3:
		11 5
		1 2 3 4 5 5 5 5 5 7 7 here lb=4 and ub=9
 * 
 */
//	    Method-1(with the help of library function)
	    if(lb<0) {lb=Math.abs(lb)-1;}//if the number is not present
	    else{ // if the number is present we are checking 
	    	//if the number is present multiple times or not
	        int y=a[lb];
	        for(int i=lb-1; i>=0; i--){
	            if(a[i]==y) --lb;
	            else break;
	        }
	    }
	    if(ub<0) {ub=Math.abs(ub)-1;}//if the number is not present
	    else{// if the number is present we are checking 
	    	//if the number is present multiple times or not
	        int y=a[ub];
	        for(int i=ub+1; i<n; i++){
	            if(a[i]==y) ++ub;
	            else break;
	        }
	        ++ub;
	    }
	    System.out.println(lb+" "+ub);//this indexing are 0 based.
//	    Method-2(by defining own functions)
	    int u=UpperBound(a,x);
	    int l=LowerBound(a,x);
	    System.out.println(l+" "+u);//this indexing are 0 based.
	}
	static int UpperBound(int a[], int x) {//closest to the left+1
		int l=-1,r=a.length;
		while(l+1<r) {
			int m=(l+r)>>>1;
	        if(a[m]<=x) l=m;
	        else r=m;
		}
		return l+1;
	}
	static int LowerBound(int a[], int x) {//closest to the right
		int l=-1,r=a.length;
		while(l+1<r) {
			int m=(l+r)>>>1;
	        if(a[m]>=x) r=m;
	        else l=m;
		}
		return r;
	}
}

