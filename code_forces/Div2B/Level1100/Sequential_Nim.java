package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Sequential_Nim {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			int n =Integer.parseInt(br.readLine()),a[]=new int[n],c=0;
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(s1.nextToken());
				if(a[i]==1) ++c;
			}
			if(c==0) System.out.println("First");
			else if(c==n) System.out.println((n&1)==0?"Second":"First");
			else {
				if(a[0]==1) {
					int l=0;
					for(int i=0; i<n; i++) {
						if(a[i]==1) ++l;
						else break;
					}
					System.out.println((l&1)==0?"First":"Second");
				}else System.out.println("First");
			}
			
		}

	}

}
