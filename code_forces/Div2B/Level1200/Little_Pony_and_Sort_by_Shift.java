package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Little_Pony_and_Sort_by_Shift {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		boolean ok=true;
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			if(i>0 && a[i]<a[i-1]) ok=false; 
		}
		if(ok) System.out.println(0);
		else {
			int j=0;
			for(int i=0; i<n-1; i++) {
				if(a[i]>a[i+1]) {j=i+1;break;}
			}
			int c=j;
			boolean f=true;
			while(j<n-1) {
				if(a[j]>a[j+1]) {f=false; break;}
				++j;
			}
			System.out.println(f && a[n-1]<=a[0]?n-c:-1);
		}
		
	}

}
