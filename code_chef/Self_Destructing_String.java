package contest.cookoff;
import java.util.*;
import java.io.*;

public class Self_Destructing_String {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		long start = System.nanoTime(); // Program Start
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s=br.readLine();
			if(((s.length())&1)==1) {
				System.out.println(-1);
				continue;
			}
			long c0=0,c1=0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='1') ++c1;
				else ++c0;
			}
			if(c1==0 || c0==0) {
				System.out.println(-1);
			}else {
				long x=Math.min(c0, c1),n=s.length();
				System.out.println((n/2)-x);
			}
		}
		long end = System.nanoTime(); // Program End
		System.err.println("Time taken: " + (end - start) / 1000000 + " ms");
	}
}