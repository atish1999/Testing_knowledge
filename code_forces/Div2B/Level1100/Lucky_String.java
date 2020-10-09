package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Lucky_String {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			if(i%4==0) System.out.print('a');
			else if(i%4==1) System.out.print('b');
			else if(i%4==2) System.out.print('c');
			else if(i%4==3) System.out.print('d');
		}

	}

}
