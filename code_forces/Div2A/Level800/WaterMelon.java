package code_forces.Div2A.Level800;

import java.io.*;

public class WaterMelon {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(br.readLine());
        if(w%2!=0 || w==2) {
        	System.out.println("NO");
        }else {
        	System.out.println("YES");
        }

	}

}
