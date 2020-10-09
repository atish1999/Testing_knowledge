package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Exams {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),c=0;
		System.out.println(k<3*n?3*n-k:0);		
	}

// Let's notice that 2n ≤ k ≤ 5n. If k < 3n author has to get 2 on some exams. 
//There are 3n - k such exams and that's the answer). If 3n ≤ k author will pass all exams (answer is 0).

}
