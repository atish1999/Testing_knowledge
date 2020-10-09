package code_forces.EDU.Binary_Search;
import java.util.*;
import java.io.*;
public class Unsigned_and_signed_right_shift {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a=n>>1;//signed right shift operatr(>>)
/*
	 All integers are signed in Java, and it is fine to use >> for negative numbers.
	 The operator ‘>>’ uses the sign bit (left most bit or M.S.B.) 
	 to fill the trailing positions after shift
	 If the number is negative, then 1 is used as a filler 
	 and if the number is positive, then 0 is used as a filler.
 	 For example, if binary representation of number is 10….100, 
 	 then right shifting it by 2 using >> will make it 11…….1.
 */
		int b=n>>>1;//unsigned right shift operatr(>>>)
/*
	In Java, the operator ‘>>>’ is unsigned right shift operator. 
	It always fills 0 irrespective of the sign of the number.
*/
//		if(n==-4)
		System.out.println(Integer.toBinaryString(n));//11111111111111111111111111111100
		System.out.println(Integer.toBinaryString(a));//11111111111111111111111111111110
//		(-2)base10=(11111111111111111111111111111110)base2
		System.out.println(Integer.toBinaryString(b));//1111111111111111111111111111110
//		(2147483646)base10=(1111111111111111111111111111110)base2
		System.out.println(a+" "+b);
	}

}
