package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Friends {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()),deg[]=new int[6];
        while(n-->0) {
        	StringTokenizer s = new StringTokenizer(br.readLine());
        	int u=Integer.parseInt(s.nextToken()),v=Integer.parseInt(s.nextToken());
        	++deg[u];++deg[v];
        }
        int c=0;
        for(int i=1; i<=5; i++) {
        	if(deg[i]>=3 || deg[i]<=1) {
        		System.out.println("WIN");
        		return ;
        	}
        }
        System.out.println("FAIL");
	}
}
