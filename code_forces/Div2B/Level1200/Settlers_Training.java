package code_forces.Div2B.Level1200;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Settlers_Training {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringTokenizer s=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
		int a[]=new int[n],count[]=new int[k+1];
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(s.nextToken());
			++count[a[i]];
			
		}
		int coin=0;
		while(count[k]!=n) {
			int i=1;
			while(i<k) {
				if(count[i]>0) {
					--count[i];++count[i+1];
					if(count[i+1]==1 && i<k-1) ++i;
				}
				++i;
			}
			++coin;
		}
		System.out.println(coin);
	}

}
