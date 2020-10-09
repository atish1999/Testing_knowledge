package code_forces.Div2B.Level800_900;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Queue_at_the_school {
	
	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),t=Integer.parseInt(st.nextToken());
		char s[]=br.readLine().toCharArray();
		while(t-->0) {
			for(int i=0; i<n-1; i++) {
				if(s[i]=='B' && s[i+1]=='G') {
					s[i]='G';s[i+1]='B';
					++i;
				}
			}
		}
		System.out.println(s);
	}

//	public static void main(String[] args)throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n =Integer.parseInt(st.nextToken()),t=Integer.parseInt(st.nextToken());
//		char s[]=br.readLine().toCharArray();
//		while(t-->0) {
//			int i=0;
//			while(i<n-1) {
//				if(s[i]=='B' && s[i+1]=='G') {
//					s[i]='G';s[i+1]='B';
//					i+=2;
//				}else ++i;	
//			}
//		}
//		System.out.println(s);
//	}

}
