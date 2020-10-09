package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Airport {

	public static void main(String[] args)throws java.lang.Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(s.nextToken()),m=Integer.parseInt(s.nextToken());
		List<Integer> a=new ArrayList<>(),b=new ArrayList<>();
		for(int i=0; i<m;i++) {
			a.add(Integer.parseInt(st.nextToken()));
			b.add(a.get(i));
		}
		int max=0,min=0,t1=n, t2=n;
		while(t1-->0) {
			Collections.sort(a, Collections.reverseOrder());
			max+=a.get(0);
			a.set(0, a.get(0)-1);
		}
		while(t2-->0) {
			Collections.sort(b);
			min+=b.get(0);
			b.set(0, b.get(0)-1);
			if(b.get(0)<=0) b.remove(0);
		}
		System.out.printf("%d %d\n",max,min);
	}
//	public static void main(String[] args)throws java.lang.Exception {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer s = new StringTokenizer(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n=Integer.parseInt(s.nextToken()),m=Integer.parseInt(s.nextToken()),a[]=new int[m];
//		int c[]=new  int[m];
//		for(int i=0; i<m;i++) {a[i]=Integer.parseInt(st.nextToken());c[i]=a[i];}
//		Arrays.sort(a);Arrays.sort(c);
//		int k=0,min=0;
//		for(int i=0; i<n; i++) {
//			min+=a[k];
//			--a[k];
//			if(a[k]==0) ++k;
//		}
//		for(int i=0; i<m/2; i++) {c[i]^=c[m-i-1];c[m-i-1]^=c[i];c[i]^=c[m-i-1];}
//		int max=0;
//		while(n-->0) {
//			max+=c[0];--c[0];
//			for(int i=1; i<m; i++) {
//				if(c[i]<=c[i-1]) break;
//				c[i]^=c[i-1];c[i-1]^=c[i];c[i]^=c[i-1];
//			}
//		}
//		System.out.printf("%d %d\n",max,min);
//	}
		

}
