package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Little_Girl_and_Game {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char s[]=br.readLine().toCharArray();
		solve(s);
	}
//	method-1 with the help of map
	static void solve(char s[]) {
		Map<Character, Integer> m=new HashMap<>();
		for(int i=0; i<s.length; i++) {
			if(!m.containsKey(s[i])) m.put(s[i], 1);
			else m.put(s[i], m.get(s[i])+1);
		}
		int c=0;
		for(Character x: m.keySet()) {
			if((m.get(x)&1)==1) {
				++c;
			}
		}
		System.out.println(c==0 || (c&1)==1?"First":"Second");
	}
//	method-2 with the help of frequency array
	static void solve1(char s[]) {
		int a[]=new int[26];
		for(int i=0; i<s.length; i++) ++a[s[i]-'a'];
		int c=0;
		for(int i=0; i<26; i++) {
			if((a[i]&1)==1) ++c;
		}
		System.out.println(c==0 || (c&1)==1 ?"First":"Second");
	}
}
