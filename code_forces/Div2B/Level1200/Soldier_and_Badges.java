package code_forces.Div2B.Level1200;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Soldier_and_Badges {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n],
		f[]=new int[6000];
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(s1.nextToken());
			++f[a[i]];
		}int count=0;
		for(int i=1; i<5999; i++) {
			if(f[i]>1) {
				while(f[i]>1) {
					--f[i];
					++f[i+1];
					++count;
				}
			}
		}
		System.out.println(count);
	/*this code will be working if we have single duplicate elements
	 * 
	 * 
	 * 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n],
		f[]=new int[n];
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(s1.nextToken());
			++f[a[i]-1];
		}
		int min=0;
		for(int i=0; i<n; i++) {
			if(f[i]>1) {min=i+1;break;}
		}
		if(min==0) System.out.println(0);
		else {
			int max=0;
			for(int i=min-1; i<n; i++) {
				if(f[i]==0) {max=i+1; break;}
			}
			System.out.println(max==0?n+1-min:max-min);
		}
		
	*/
	}

}
