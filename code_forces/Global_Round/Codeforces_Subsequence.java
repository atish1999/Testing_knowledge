package code_forces.Global_Round;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Codeforces_Subsequence {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long k=Long.parseLong(br.readLine());
		long subse=1,a[] = new long[10];int temp=0;
		for(int i=0; i<10; i++) a[i]=1;//initially all characters frequency will be 1.
		while(subse<k) {
			++a[temp];
			temp=(temp+1)%10;
			subse=1;
			for(long e: a) subse*=e; // we are increasing frequency
		}
		String s ="codeforces";
		for(int i=0; i<10; i++) {
			for(int j=0; j<a[i]; j++) {
				System.out.print(s.charAt(i));
			}
		}
    }

}
