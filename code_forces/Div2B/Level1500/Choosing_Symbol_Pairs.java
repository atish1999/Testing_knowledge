package code_forces.Div2B.Level1500;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Choosing_Symbol_Pairs {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			if(m.containsKey(s.charAt(i))) m.put(s.charAt(i), m.get(s.charAt(i))+1);
			else m.put(s.charAt(i),1);
		}
		long ans=0;
		for(Character c: m.keySet()) ans+=Math.pow(m.get(c), 2);
		System.out.println(ans);
	}

}
