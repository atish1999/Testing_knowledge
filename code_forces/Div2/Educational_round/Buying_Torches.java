package code_forces.Div2.Educational_round;
import java.util.*;
import java.io.*;
public class Buying_Torches {

	static long ceil_div(long a, long b) {
		//USE THIS CEIL FUNCTION INSTEAD OF BUILT IN CEIL...
//   a is numerator and b is denominator
//	for positive integers a and b ceil(a/b)=floor((a+b-1)/b)
//	we can even avoid ceil function. Just Add denominator — 1 to the Numerator. 
//  It will always give ceil value
		return (a+b-1)/b;
	}
	public static void main(String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        long x=Long.parseLong(st.nextToken()),y=Long.parseLong(st.nextToken()),
	        k=Long.parseLong(st.nextToken());
	        long req=(y*k)+(k-1);
	        long trade=ceil_div(req, x-1);
	        trade+=k;
	        System.out.println(trade);
	    }
	}
	static void solve12()throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        long x=Long.parseLong(st.nextToken()),y=Long.parseLong(st.nextToken()),
	        k=Long.parseLong(st.nextToken());
//	        to form k torch we need k sticks and k coals.as we have 1 stick initially
//	        we need k-1 sticks now. but to have k coals we need k*y sticks because in
//	        one trade we can get 1 coal for the exchange of y sticks.thus total number
//	        of sticks required are (y*k) sticks for coal + (k-1) sticks
	        long req=(y*k)+(k-1);
//	        in one trade of stick we will get x stick for the exchange of 1 stick
//	        i.e. we will be getting effectively (x-1) sticks in one trade.
	        long ans=(req)/(x-1);
//	        just check if the required number of sticks are divisible of (x-1) 
//	        or not.
	        if(req%(x-1)>0) ++ans;
	        ans+=k;
	        System.out.println(ans);
	    }
	}

}
