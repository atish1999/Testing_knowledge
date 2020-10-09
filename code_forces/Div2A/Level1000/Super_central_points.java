package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Super_central_points {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[]=new int[n],b[]=new int[n],x=0,count=0;
		while(x<n) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[x]=Integer.parseInt(st.nextToken());b[x]=Integer.parseInt(st.nextToken());
			++x;
		}
		for(int i=0; i<n; i++) {
			int p=a[i],q=b[i],r=0,l=0,u=0,lo=0;
			for(int j=0; j<n; j++) {
				if((a[j]>p || a[j]<p) && b[j]==q) {
					if(a[j]>p) ++r;
					else ++l;
				}else if((b[j]>q||b[j]<q) && a[j]==p) {
					if(b[j]>q) ++u;
					else ++lo;
				}
				if( r>=1 && l>=1 && u>=1 && lo>=1) {
					++count;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
