package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Binary_String_To_Subsequences {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int n=Integer.parseInt(br.readLine());
			char s[]=br.readLine().toCharArray();
			List<Integer> l=new ArrayList<>();int size=0;
			for(int i=0,one=0,zero=0; i<n; i++) {
				if(s[i]=='1') {
					++one;
					if(zero!=0) {l.add(zero);--zero;}
					else l.add(one);
				}else {
					++zero;
					if(one!=0) --one;
					l.add(zero);
				}
				size=Math.max(size, Math.max(zero, one));
			}
			System.out.println(size);
			for(int i=0; i<n; i++) System.out.print(l.get(i)+" ");
			System.out.println();
		}
	}

}
