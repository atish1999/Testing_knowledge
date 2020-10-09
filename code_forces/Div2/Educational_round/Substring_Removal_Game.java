package code_forces.Div2.Educational_round;
import java.util.*;
import java.io.*;
public class Substring_Removal_Game {
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			char s[]=br.readLine().toCharArray();
			int count=0;
			List<Integer> l=new ArrayList<>();
			for(int i=0; i<s.length; i++ ) {
				if(s[i]=='0') {
					if(count!=0) l.add(count);
					count=0;
					continue;
				}
				++count;
			}
			if(count!=0) l.add(count);
			Collections.sort(l, Collections.reverseOrder());
			int ans=0;
			for(int i=0; i<l.size(); i+=2) ans+=l.get(i);
			System.out.println(ans);
		}
    }

//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			char s[]=br.readLine().toCharArray();
//			int n=s.length;
//			List<Integer> l=new ArrayList<>();
//			for(int i=0; i<n; ) {
//				int c=0,j;
//				if(s[i]=='0') {++i;}
//				else {
//					for(j=i; j<s.length; ++j) {
//						if(s[j]=='1') {++c;}
//						else break;	
//					}
//					l.add(c);
//					i=j;
//				}
//			}
//			Collections.sort(l, Collections.reverseOrder());
//			int ans=0;
//			for(int i=0; i<l.size(); i+=2) ans+=l.get(i);
//			System.out.println(ans);
//		}
//	}

}
