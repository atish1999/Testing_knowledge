package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Help_Chef_Gerasim {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n],b[]=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(br.readLine());
			b[i]=a[i];
		}
		Arrays.sort(a);
		if(a[0]==a[n-1]) System.out.println("Exemplary pages.");
		else {
			int p1=0,p2=0;
			int d=(a[n-1]-a[0])/2;
			for(int i=0; i<n; i++) {
				if(b[i]==a[0]) {
					b[i]+=d;
					p1=i+1;
					break;
				}
			}
			for(int i=0; i<n; i++) {
				if(b[i]==a[n-1]) {
					b[i]-=d;
					p2=i+1;
					break;
				}
			}
			boolean ok=true;
			for(int i=1; i<n; i++) {
				if(b[i]!=b[i-1]) {ok=false;break;}
			}
			System.out.println(!ok?"Unrecoverable configuration.":d+" ml. from cup #"+p1+" to cup #"+p2+".");
		}
	}

}
