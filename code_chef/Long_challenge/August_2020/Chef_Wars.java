package code_chef.Long_challenge.August_2020;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Chef_Wars {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int h=Integer.parseInt(st.nextToken()),p=Integer.parseInt(st.nextToken());
			boolean ok=false;
			while(p>0) {
				h-=p;
				if(h<=0) {ok=true;break;}
				p/=2;
			}
			System.out.println(ok?1:0);
		}
	}

}
