package Strivers_Sheet;

import java.util.Scanner;

public class Print_All_Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
		
	}

}
