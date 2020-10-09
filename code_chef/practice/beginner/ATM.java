package code_chef.practice.beginner;

import java.io.*;
import java.util.*;

public class ATM {
	static final double BANK_CHARGE = 0.50;
	public static void main(String[] args) throws java.lang.Exception{
		 Scanner sc = new Scanner( System.in );

	        double withdrawalAmount = sc.nextDouble();
	        double accountBalance = sc.nextDouble();

	        if( withdrawalAmount % 5 == 0 && accountBalance >= ( withdrawalAmount + BANK_CHARGE ) )
	        {
	            accountBalance = accountBalance - ( withdrawalAmount + BANK_CHARGE );
	        }

	        System.out.print( accountBalance );
	}

}
