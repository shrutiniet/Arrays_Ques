package array;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter array size=");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter array ele=");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter position whose ele need to delete:");
		int pos=sc.nextInt();
		if(pos<0 || pos>arr.length)
		{
			System.out.println("Invalid deletion");
		}
		else
		{
			for(int i=pos;i<n-1;i++)
			{
				arr[i]=arr[i+1];
			}
			System.out.println("After deletion=");
			for(int i=0;i<n-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
