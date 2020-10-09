package code_forces.Div2A.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ebony_and_Ivory {
	public static void main(String[] args)  throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());
		boolean ok=false;
		//xa+yb=c {if there is any possible x and y then solution will exist}
		for(int i=0; i*a<=c; i++) {
			if((c-i*a)%b==0) {ok=true;break;}
		}
		System.out.println(ok?"Yes":"No");
	}

//	public static void main(String[] args)  throws java.lang.Exception {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());
//		if(c<a && c<b) System.out.println("No");
//		else if(c%a==0||c%b==0) System.out.println("Yes");
//		else {
//			boolean ok=false;
//			int d=c;
//			while(c!=0) {
//				c-=a;
//				if(c%b==0) {
//					System.out.println("Yes");ok=true;break;
//				}else if(c<b) {System.out.println("No");ok=true;break;}
//			}
//			if(!ok) {
//				while(d!=0) {
//					d-=b;
//					if(d%a==0) {System.out.println("Yes");ok=true;break;}
//					else if(d<a) {System.out.println("No");ok=true;break;}
//				}
//			}
//			if(!ok) System.out.println("No");
//		}
//	}

}
