package code_chef.Long_challenge.July_2020;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Ada_King {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			int k=Integer.parseInt(br.readLine()),count=0;
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					++count;
					System.out.print(count==k?'O':count<k?'.':'X');
				}
				System.out.println();
			}
		}
	}

}
