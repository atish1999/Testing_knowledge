package hackerrank.java;

import java.io.*;
import java.util.*;

public class End_of_file {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
//		boolean ok = a.charAt(0)<=b.charAt(0)?false:true;
		boolean ok=(a.compareTo(b))>0?true:false;
		System.out.println(ok?"Yes":"No");
	}

}
