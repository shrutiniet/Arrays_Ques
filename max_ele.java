package array;

import java.util.Scanner;

public class max_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array=");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements=");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int max=arr[0];
		int pos=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				pos=i+1;
			}
		}
		System.out.println("max ele is "+ max +" found at "+pos +" position");

	}

}
