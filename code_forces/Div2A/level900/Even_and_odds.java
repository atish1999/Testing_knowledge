package code_forces.Div2A.level900;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Even_and_odds {

	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n=Long.parseLong(st.nextToken()),k=Long.parseLong(st.nextToken());
		long mid = n%2==0? n/2: n/2+1;long ans=0;
		if(k<=mid) {
			ans=1+(k-1)*2; //2*k-1
		}else {				//using A.P.
			ans=2+(k-(mid+1))*2;//
		}
		System.out.println(ans);
	}

}
