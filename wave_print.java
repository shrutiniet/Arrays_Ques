package array;

import java.util.Scanner;

public class wave_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("wave Print");
		for(int j=0;j<n;j++)
		{
			if(j%2==0)
			{
				for(int i=0;i<m;i++)
					System.out.print(arr[i][j]);
			}
			else
			{
				for(int i=m-1;i>=0;i--)
					System.out.print(arr[i][j]);
			}
			System.out.println();
			
		}
		

	}

}
