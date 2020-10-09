package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class DZY_love_String {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine(),s1="abcdefghijklmnopqrstuvwxyz";
		int k=Integer.parseInt(br.readLine()),v[]=new int[26],max=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Character,Integer> m= new HashMap<>();
		for(int i=0; i<26; ++i) {
			v[i]=Integer.parseInt(st.nextToken());
			max=Math.max(max, v[i]);
			m.put(s1.charAt(i), v[i]);
		}
		int ans=0;
		for(int i=0; i<s.length(); i++)  ans+=m.get(s.charAt(i))*(i+1);
		for(int i=s.length()+1; i<=s.length()+k; i++) ans+=max*(i);
		System.out.println(ans);
	}
//	public static void main(String[] args) throws java.lang.Exception
//  {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    char s[]=br.readLine().toCharArray();
//		int k=Integer.parseInt(br.readLine()),v[]=new int[26],max=0;
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i=0; i<26; ++i) {
//			v[i]=Integer.parseInt(st.nextToken());
//			max=Math.max(max, v[i]);
//		}
//		int ans=0;
//		for(int i=0; i<s.length; i++) ans+=(v[s[i]-'a'])*(i+1);
		//(s[i]-'a') or (s[i]-97) will give other characters 
//		for(int i=s.length+1; i<=s.length+k; i++) ans+=max*i;
//		System.out.println(ans);
//		
//	}

}
