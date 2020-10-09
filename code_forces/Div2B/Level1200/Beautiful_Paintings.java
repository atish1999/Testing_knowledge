package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Beautiful_Paintings {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),a[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(a);
		int c=0;
		for(int i=0,j=1; i<n && j<n; ) {
			if(a[i]==a[j]) ++j;
			else if(a[i]<a[j]) {
				++c;
				i++;j++;
			}
		}
		System.out.println(c);
	}

}
