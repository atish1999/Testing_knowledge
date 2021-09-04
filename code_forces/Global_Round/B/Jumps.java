package code_forces.Global_Round.B;
import java.util.*;
import java.io.*;

public class Jumps {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		long start = System.nanoTime(); // Program Start
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long x=Long.parseLong(st.nextToken());
			int i=0;
			long sum=0;
			while(true) {
				sum+=i;
				if(sum==x) {
					System.out.println(i);
					break;
				}else if(sum>x) {
					long diff=(sum-x);
					if(diff==1) {
						System.out.println(i+1);
					}else {
						System.out.println(i);
					}
					break;
				}
				++i;
			}
		}
		long end = System.nanoTime(); // Program End
		System.err.println("Time taken: " + (end - start) / 1000000 + " ms");
	}
}
