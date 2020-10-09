package code_forces.Div2.contest.A;
import java.util.*;
import java.io.*;

public class Fence_675A {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		long start = System.nanoTime(); // Program Start
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken()),
				b=Integer.parseInt(st.nextToken()),
				c=Integer.parseInt(st.nextToken());
			System.out.println(Math.max(a, Math.max(c, b))+1);
		}
		long end = System.nanoTime(); // Program End
		System.err.println("Time taken: " + (end - start) / 1000000 + " ms");
	}
}
