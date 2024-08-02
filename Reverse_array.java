package array;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array=");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements=");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int i=0;
		int j=n-1;
		while(i<j)
		{
			int tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
			i++;
			j--;
		}
		System.out.println("After Reverse array=");
		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+" ");
		}

	}

}
