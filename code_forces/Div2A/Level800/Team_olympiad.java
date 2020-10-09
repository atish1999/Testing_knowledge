package code_forces.Div2A.Level800;

import java.io.*;
import java.util.*;

public class Team_olympiad {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine()),a[]=new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> p=new ArrayList<>();List<Integer> m=new ArrayList<>();List<Integer> e=new ArrayList<>();
		int c1=0, c2=0, c3=0, w=0;
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			if(a[i]==1) {
				++c1;
				p.add(i+1);
				
			}else if(a[i]==2) {
				++c2;
				m.add(i+1);
			}else {
				++c3;
				e.add(i+1);
			}
		}
		w=c1<=c2&&c1<=c3?c1:c2<=c1&&c2<=c3?c2:c3;
		System.out.println(w);
		for(int i=0; i<w; i++) {
			System.out.println(p.get(i)+" "+m.get(i)+" "+e.get(i));
		}
	
		
	}

}
