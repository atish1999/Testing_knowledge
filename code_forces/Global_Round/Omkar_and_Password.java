package code_forces.Global_Round;
import java.util.*;
import java.io.*;
public class Omkar_and_Password {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0){
			int n=Integer.parseInt(br.readLine()),a[]=new int[n];
			StringTokenizer s = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
			Arrays.sort(a);int c=0;
			for(int i=0; i<n-1; i++) {
				if(a[i]==a[i+1])++c;
				else break;
			}
			System.out.println(c==n-1?n:1);
		}

	}

}
