package code_forces.Global_Round;
import java.util.*;
import java.io.*;
public class Omkar_and_Waterslide {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0){
			int n=Integer.parseInt(br.readLine());long a[]=new long[n],ans=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				a[i]=Integer.parseInt(st.nextToken());
				if(i>0) {
					if(a[i-1]>a[i]) ans+=a[i-1]-a[i];
				}
			}
			System.out.println(ans);
		}
	}

}
