package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Lecture {
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		Map<String, String> h=new HashMap<>();
		for(int i=0; i<m; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			String a=s.nextToken(),b=s.nextToken();
			if(a.length()>b.length()) h.put(a, b);
			else h.put(a, a);
		}
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) System.out.print(h.get(s1.nextToken())+" ");
		
	}

//	public static void main(String[] args)throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n =Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
//		String[] l = new String[n],a=new String[m],b=new String[m];
//		for(int i=0; i<m; i++) {
//			StringTokenizer s = new StringTokenizer(br.readLine());
//			a[i]=s.nextToken();b[i]=s.nextToken();
//		}
//		StringTokenizer s1 = new StringTokenizer(br.readLine());
//		for(int i=0; i<n; i++) {
//			l[i]=s1.nextToken();
//			for(int j=0; j<a.length; j++) {
//				if(l[i].equals(a[j]) && l[i].length()>b[j].length()) {
//					l[i]=b[j];break;
//				}
//			}
//		}		
//		for(String e: l) System.out.print(e+" ");
//		
//	}

}
