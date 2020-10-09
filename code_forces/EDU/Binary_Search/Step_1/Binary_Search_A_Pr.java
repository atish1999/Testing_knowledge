package code_forces.EDU.Binary_Search.Step_1;
import java.util.*;
import java.io.*;
public class Binary_Search_A_Pr {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(s.nextToken()),k=Integer.parseInt(s.nextToken());
		int a[]=new int[n];
		 s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
		Arrays.sort(a);
		 s = new StringTokenizer(br.readLine());
		while(k-->0) {
			int target=Integer.parseInt(s.nextToken());
			int x=Arrays.binarySearch(a, target);
			System.out.println(x<0?"NO":"YES");
		}

	}

}
