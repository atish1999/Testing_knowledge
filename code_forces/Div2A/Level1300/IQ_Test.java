package code_forces.Div2A.Level1300;
import java.util.*;
import java.lang.*;
import java.io.*;
public class IQ_Test {
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),c=0,c1=0,a[]=new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int e=0,o=0;
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			if((a[i]&1)==0) {++c;e=i+1;}
			else {++c1;o=i+1;}
		}
		System.out.println(c>c1? o:e);
		
	}

//	public static void main(String[] args) throws java.lang.Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n=Integer.parseInt(br.readLine()),c=0,c1=0,a[]=new int[n];
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		List<Integer> e=new ArrayList<>(),o=new ArrayList<>();
//		for(int i=0; i<n; i++) {
//			a[i]=Integer.parseInt(st.nextToken());
//			if((a[i]&1)==0) {++c;e.add(i+1);}
//			else {++c1;o.add(i+1);}
//		}
//		System.out.println(c>c1? o.get(0):e.get(0));
//		
//	}

}
