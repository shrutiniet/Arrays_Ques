package array;

import java.util.Scanner;

public class max_sum_normal_mehod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array=");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements=");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int max=0;
		for(int i=0;i<n-1;i++)
		{
			int val=arr[i];
			if(val>max)
				max=val;
			for(int j=i+1;j<n;j++)
			{
				val=val+arr[j];
				if(val>max)
					max=val;
			}
		}
		System.out.println("Maximum Sum= "+max);

	}

}
