package code_forces.Div2A.Level800;
import java.io.*;
import java.util.*;
public class Playing_with_Dice {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a =Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
        int d[]= {1,2,3,4,5,6},p1=0,p2=0,pd=0;
        for(int i=0; i<d.length; i++) {
        	if(Math.abs(a-d[i])==Math.abs(b-d[i])) ++pd;
        	else if(Math.abs(a-d[i])<Math.abs(b-d[i])) ++p1;
        	else ++p2;
        }
        System.out.println(p1+" "+pd+" "+p2);
	}

}
