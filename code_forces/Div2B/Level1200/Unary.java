package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Unary {

	static int mod=1000003;
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> m=new HashMap<>();	String s=br.readLine(),s1="";
		m.put('>',1000);m.put('<',1001);m.put('+',1010);m.put('-',1011);
		m.put('.',1100);m.put(',',1101);m.put('[',1110);m.put(']',1111);
		for(int i=0; i<s.length(); i++) s1+=m.get(s.charAt(i));
		int ans=0,index=1;
		for(int i=s1.length()-1; i>=0; i--) {
			if(s1.charAt(i)=='1') ans=(ans+index)%mod;
			index=(index*2)%mod;
		}
		System.out.println(ans%mod);
    }

}
