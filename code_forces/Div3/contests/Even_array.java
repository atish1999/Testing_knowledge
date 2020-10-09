package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Even_array {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n= Integer.parseInt(br.readLine()),a[]=new int[n],c3=0,c4=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(st.nextToken());
				if(i%2==0 && a[i]%2 !=0) ++c4;
				if(i%2==1 && a[i]%2 ==0) ++c3;
			}
			System.out.println(c3==c4?c3:-1);		
		}
	}

}
