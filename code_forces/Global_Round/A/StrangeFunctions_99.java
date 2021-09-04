package code_forces.Global_Round.A;
import java.util.*;
import java.io.*;

public class StrangeFunctions_99 {

	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) throws java.lang.Exception {
		long start = System.nanoTime(); // Program Start
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s=br.readLine();
			System.out.println(s.length());
			
		}
		long end = System.nanoTime(); // Program End
		System.err.println("Time taken: " + (end - start) / 1000000 + " ms");
	}
}
