package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Palindromic_times {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int hh=Integer.parseInt(s.substring(0, 2)),mm=Integer.parseInt(s.substring(3));
		do {
			++mm;
			if(mm==60) {++hh;mm=0;}
			if(hh==24) hh=0;
		}while((hh%10*10+hh/10) != mm);
		System.out.printf("%02d:%02d\n",hh,mm);	
	}
}
