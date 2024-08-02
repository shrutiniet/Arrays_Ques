package Strivers_Sheet;

import java.util.Scanner;

public class Hashing_count_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[]hash=new int[16];
		for(int i=0;i<n;i++)
		{
			hash[arr[i]]+=1;
		}
		System.out.println("Enter count of value to check freq");
		int freq=sc.nextInt();
		while(freq>0)
		{
			System.out.println("Enter val=");
			int val=sc.nextInt();
			System.out.println(hash[val]);
			freq--;
		}

	}

}
