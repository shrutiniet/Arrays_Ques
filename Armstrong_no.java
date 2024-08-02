package Strivers_Sheet;

import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dig=Count(n);
		int ans=0;
		int check=n;
		while(n>0)
		{
			int rem=n%10;
			ans=ans+(int)Math.pow(rem,dig);
			n/=10;
		}
		if(ans==check)
			System.out.println("Armstrong no");
		else
			System.out.println("Not Armstrong no");

	}
	public static int Count(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		return count;
	}

}
