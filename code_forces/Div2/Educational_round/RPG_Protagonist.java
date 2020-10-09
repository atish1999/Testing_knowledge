package code_forces.Div2.Educational_round;
import java.util.*;
import java.io.*;
public class RPG_Protagonist {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			long p=Long.parseLong(st.nextToken()),f=Long.parseLong(st.nextToken());
			st=new StringTokenizer(br.readLine());
			long ns=Long.parseLong(st.nextToken()),nw=Long.parseLong(st.nextToken());
			st=new StringTokenizer(br.readLine());
			long s=Long.parseLong(st.nextToken()),w=Long.parseLong(st.nextToken());
			long cap=p+f,ans=0,ans1=0,cap1=cap;
				if(s*ns<=cap) {ans+=ns; cap-=s*ns;}
				else {ans+=(cap/s); cap-=(cap/s)*ns;} 
				if(w*nw<=cap) {ans+=nw; cap-=w*nw;}
				else {ans+=(cap/w); cap-=((cap/w)*nw);}
		
				if(w*nw<=cap1) {ans1+=nw; cap1-=w*nw;}
				else {ans1+=(cap1/w); cap1-=((cap1/w)*nw);}
				if(s*ns<=cap1) {ans1+=ns; cap1-=s*ns;}
				else {ans1+=(cap1/s); cap1-=(cap1/s)*ns;} 
			
			System.out.println(Math.max(ans, ans1));
		}
	}

}
