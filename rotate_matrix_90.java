package array;
import java.util.*;
public class rotate_matrix_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]arr=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		//Rotate1(arr,n);    // Extra Space  // O(n*n)
		Rotate2(arr,n);   //without extra space 
		/* Firstly transpose the matrix, then reverse each row's element*/

	}
public static void Rotate1(int[][]arr, int n)
{
	int[][]dummy=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			dummy[j][n-(i+1)]=arr[i][j];
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			arr[i][j]=dummy[i][j];
		}
	}
	System.out.println("After Rotation=");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
			System.out.print(arr[i][j]+" ");
		System.out.println();
	}
}
public static void Rotate2(int[][]arr, int n)
{
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{
			int tmp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=tmp;
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<(n/2);j++)
		{
			int tmp=arr[i][j];
			arr[i][j]=arr[i][n-j-1];
			arr[i][n-j-1]=tmp;
		}
	}
	System.out.println("After Rotation=");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
			System.out.print(arr[i][j]+" ");
		System.out.println();
	}
}
}
