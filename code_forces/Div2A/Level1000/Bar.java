package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Bar {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bar[]= {"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE",
        		"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17"};
        int n =Integer.parseInt(br.readLine()),c=0;
        while(n-->0) {
        	String a=br.readLine();
        	for(int i=0; i<bar.length; i++) {
        		if(a.equals(bar[i])){ ++c;break;}
        	}   	
        }
        System.out.println(c);
        
	}

}
