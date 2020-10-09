package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Dragon {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s =Integer.parseInt(st.nextToken()),n=Integer.parseInt(st.nextToken()),
			a[]=new int[n],b[]=new int[n];boolean f=true;
		for(int i=0; i<n; i++) {
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			a[i] =Integer.parseInt(s1.nextToken());b[i]=Integer.parseInt(s1.nextToken());
		}
		for(int i=0; i<n-1; i++) {
			int minInd=i;
			for(int j=i+1; j<n; j++) {
				if(a[j]<a[minInd]) minInd=j;
			}
			int temp=a[minInd];
			a[minInd]=a[i];
			a[i]=temp;
			int t=b[minInd];
			b[minInd]=b[i];
			b[i]=t;
		}
	
		for(int i=0; i<n; i++) {
			if(s>a[i]) s+=b[i];
			else { f=false;break;}
		}
		System.out.println(f?"YES":"NO");
	}

}
