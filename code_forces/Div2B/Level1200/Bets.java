package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Bets {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		int a[][]=new int[m][4];
		for(int i=0; i<m; i++) {
			StringTokenizer s=new StringTokenizer(br.readLine());
			a[i][0]=Integer.parseInt(s.nextToken());a[i][1]=Integer.parseInt(s.nextToken());
			a[i][2]=Integer.parseInt(s.nextToken());a[i][3]=Integer.parseInt(s.nextToken());
		}
		int ans=0;
		for(int i=1; i<=n; i++) {
			int min=10001,max=0,position=-1;
			for(int p=0; p<m; p++) {
				if(a[p][0]<=i && a[p][1]>=i) {
					if(a[p][2]<min ) {min=a[p][2];position=p;}
					//in case of equal time pariticipant with samller index number will win(given)
					//that's why we have ignored "=" sign in above minimum checking condition..
					//i.e. jo pehle mil rahi hai uska answer hai...
				}
			}
			if(position!=-1) ans+=a[position][3];
			else ans+=0;
		}
		System.out.println(ans);
	}

}
