package code_chef.Long_challenge.July_2020;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Chef_and_card_game {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine()),c=0,m=0;
			while(n-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a =Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
				if(f(a)>f(b)) {c+=1;m+=0;}
				else if(f(a)==f(b)) {c+=1;m+=1;}
				else {c+=0;m+=1;}
			}
			System.out.println(c>m?0+" "+c:c==m?2+" "+c:1+" "+m);
		}

	}
	static int f(int a) {
		int sum=0;
		while(a!=0) {
			sum+=a%10;
			a/=10;
		}
		return sum;
	}

}
