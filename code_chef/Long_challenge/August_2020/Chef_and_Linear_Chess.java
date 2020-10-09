package code_chef.Long_challenge.August_2020;
import java.util.*;
import java.io.*;
public class Chef_and_Linear_Chess {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0){
			StringTokenizer s = new StringTokenizer(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(s.nextToken()),k=Integer.parseInt(s.nextToken());
			int a[]=new int[n],min=Integer.MAX_VALUE,position=0;
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(st.nextToken());
				if(k%a[i]==0) {
					if(k/a[i]<=min) {
						min=k/a[i];position=a[i];
					}
				}
			}
			System.out.println(position==0?-1:position);
		}
	}

}
