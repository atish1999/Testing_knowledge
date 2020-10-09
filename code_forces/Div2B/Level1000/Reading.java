package code_forces.Div2B.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Reading {
	
	public static void main(String[] args) throws java.lang.Exception
    {	
		Scanner sc = new Scanner((new FileReader("input.txt")));
		FileWriter out = new FileWriter("output.txt");
		int n =sc.nextInt(),k=sc.nextInt();
		List<Integer> a=new ArrayList<>();
		for(int i=0; i<n; i++) a.add(sc.nextInt());
		List<Integer> b=new ArrayList<>(a);
		Collections.sort(b);
		out.write(b.get(n-k)+"\n");
		int h=b.get(n-k);
		for(int i=0; i<n; i++) {
			if(a.get(i)>=h && k>0) {
				out.write(i+1+" ");--k;
			}
		}
		sc.close();
		out.close();
	}
		
}
