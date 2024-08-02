package array;

import java.util.Scanner;

public class Kadane_max_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array=");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements=");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			max=Math.max(sum, max);
			if(sum<0)
				sum=0;
		}
		System.out.println("Max value= "+ max);

	}

}
