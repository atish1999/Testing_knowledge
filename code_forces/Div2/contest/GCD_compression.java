package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;

public class GCD_compression {
	
		public static void main(String[] args) throws java.lang.Exception
	    {		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());
			while(t-->0) {
				int n=Integer.parseInt(br.readLine()),a[]=new int[n*2],x=0;
				StringTokenizer st = new StringTokenizer(br.readLine());
				while(x<2*n) {a[x]=Integer.parseInt(st.nextToken());++x;}
				List<Integer> o= new ArrayList<>(),e=new ArrayList<>();
				for(int i=0; i<a.length; i++) {
					if((a[i]&1)==0) e.add(i+1);
					else o.add(i+1);
				}
				int k=0,l=0,count=0;
				while(count<n-1) {
					if(k<o.size()-1) {
						System.out.println(o.get(k)+" "+o.get(k+1));
						k+=2;++count;
					}else {
						System.out.println(e.get(l)+" "+e.get(l+1));
						l+=2;++count;
					}
				}

			}	
		}	
//	static class Pair<X, Y>{
//		X x; Y y;
//		public Pair(X x,Y y) {
//			this.x=x;
//			this.y=y;
//		}
//	}
//
//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			int n=Integer.parseInt(br.readLine()),a[]=new int[n*2],x=0;
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			while(x<2*n) {a[x]=Integer.parseInt(st.nextToken());++x;}
//			List<Integer> o= new ArrayList<>(),e=new ArrayList<>();
//			for(int i=0; i<a.length; i++) {
//				if((a[i]&1)==0) e.add(i+1);
//				else o.add(i+1);
//			}
//			List<Pair<Integer, Integer>> l=new ArrayList<>();
//			for(int i=0; i<o.size()-1; i+=2) l.add(new Pair(o.get(i),o.get(i+1)));			
//			for(int i=0; i<e.size()-1; i+=2) l.add(new Pair(e.get(i),e.get(i+1)));
//			for(int i=0; i<n-1; i++) System.out.println(l.get(i).x+" "+l.get(i).y);	
//
//		}	
//	}	
//	static class Pair{
//		int first;
//		int second;
//		public Pair(int first, int second) {
//			this.first=first;
//			this.second=second;
//		}
//	}
//
//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			int n=Integer.parseInt(br.readLine()),a[]=new int[n*2],x=0;
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			while(x<2*n) {a[x]=Integer.parseInt(st.nextToken());++x;}
//			List<Integer> o= new ArrayList<>(),e=new ArrayList<>();
//			for(int i=0; i<a.length; i++) {
//				if((a[i]&1)==0) e.add(i+1);
//				else o.add(i+1);
//			}
//			List<Pair> l=new ArrayList<>();
//			for(int i=0; i<o.size()-1; i+=2) l.add(new Pair(o.get(i),o.get(i+1)));			
//			for(int i=0; i<e.size()-1; i+=2) l.add(new Pair(e.get(i),e.get(i+1)));
//			for(int i=0; i<n-1; i++) System.out.println(l.get(i).first+" "+l.get(i).second);	
//
//		}	
//	}	
}
