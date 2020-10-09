package code_forces.Div2B;
import java.util.*;
import java.io.*;
public class Petr_and_a_Combination_Lock {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),angle[]=new int[n];
		for(int i=0; i<n; i++) angle[i]=Integer.parseInt(br.readLine());
		boolean ok=false;
		for(int i=0; i<(1<<n); i++) {
			int finall=0;
			for(int j=0; j<n; j++) {
				if((i&(1<<j))!=0) finall-=angle[j];
				else finall+=angle[j];
			}
			System.out.println(finall);
			if(finall%360==0) {ok=true;break;}
		}
		System.out.println(ok?"YES":"NO");
	}

}
