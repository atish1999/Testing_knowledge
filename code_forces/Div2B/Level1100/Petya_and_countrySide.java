package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Petya_and_countrySide {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()),a[]=new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
		int count =1;
		for(int i=0; i<n; i++) {
			int temp=a[i],x=1;
			for(int j=i+1; j<n; j++) {	
				if(temp>=a[j]) {temp=a[j];++x;}
				else break;
			}
			temp=a[i];
			for(int j=i-1; j>=0; j--) {
				if(temp>=a[j]){temp=a[j];++x;}
				else break;
			}
			count=Math.max(count, x);
		}
		System.out.println(count);
	}

}
