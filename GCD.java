package Strivers_Sheet;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int divisor=sc.nextInt();
		int divident=sc.nextInt();
		while(divisor!=0)
		{
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println("GCD= "+divident);
		

	}

}
