package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Archer {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		double a=Double.parseDouble(st.nextToken()),b=Double.parseDouble(st.nextToken()),
		c=Double.parseDouble(st.nextToken()),d=Double.parseDouble(st.nextToken());
		double p=a/b;
		double q=(1-c/d)*(1-a/b);//sample space i.e. the probability of shooting the target
//		We need to find the P(A)/ (P(A union B) compliment.)
//		wining prob=P(A)/(1-P(A)*P(B))
//		By De Moivre's theorem,
//      P(A union B) compliment = P(A compliment intersection B compliment)
//      Since winnings of both A and B are independent.
//      the above statement can be written as
//      P(A compliment) * P(B compliment) = (1-P(A)*P(B))
		System.out.println((p)/(1-q));
	}

}
