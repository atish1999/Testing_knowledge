package LeetCode.arrays.Easy;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Two_Sum {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),t=Integer.parseInt(st.nextToken());
		int c[]=new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			c[i]=Integer.parseInt(s.nextToken());
		}
		int d[]=twoSum(c,t);
		for(int e: d) System.out.print(e+" ");

	}
	static int[] twoSum(int[] nums, int target) {
		 int a[]=new int[2];
	        Arrays.sort(nums);
	       int i=0, j=nums.length-1;
	        while(i<j){
	            if((nums[i]+nums[j])==target){
	                a[0]=i;a[1]=j;
	                break;
	            }else if(nums[i]+nums[j]<target) ++i;
	            else --j;
	        }
	        return a;
	    }
	}

