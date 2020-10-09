package code_forces.Div2A.Level1200;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Next_test {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),max=0,a[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			max=Math.max(max, a[i]);
		}
		Arrays.sort(a);
		boolean b[]=new boolean[max+1];b[0]=true;int c=0;
		for(int i=0; i<n; i++) b[a[i]]=true;
		for(int i=0; i<b.length; i++) {
		    if(!b[i]) {System.out.println(i);break;}
		    else ++c;
		}
		if(c==b.length) System.out.println(a[n-1]+1);
	}
//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n=Integer.parseInt(br.readLine()),max=0,a[]=new int[n];
//		StringTokenizer st=new StringTokenizer(br.readLine());
//		for(int i=0; i<n; i++) a[i]=Integer.parseInt(st.nextToken());
//		Arrays.sort(a);
//		if(a.length==1) System.out.println(a[0]==1?2:1);
//		else if(a.length==2) System.out.println(a[0]==1 && a[1]==2?3:a[0]>1?1:2);
//		else {
//			boolean b[]=new boolean[a[n-1]+1];
//			b[0]=true;
//			for(int i=0; i<n; i++) b[a[i]]=true;
//			int c=0;
//			for(int i=0; i<b.length; i++) {
//				if(!b[i]) {System.out.println(i);break;}
//				else ++c;
//			}
//			if(c==b.length) System.out.println(a[n-1]+1);
//		}
//	}

}
