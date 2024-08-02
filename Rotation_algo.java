package array;

import java.util.Scanner;

public class Rotation_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array=");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements=");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter rotation= ");
		int k=sc.nextInt();
		if(k>n)
			k=k%n;
		Rotate(arr,0,k-1);
		Rotate(arr,k,n-1);
		Rotate(arr,0,n-1);
		System.out.println("After Rotation=");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}
	public static void Rotate(int[]arr, int i, int j)
	{
		while(i<j)
		{
			int tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
			i++;
			j--;
		}
	}

}
