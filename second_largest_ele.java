package array;
import java.util.Arrays;
import java.util.Scanner;
public class second_largest_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//BRUTE FORCE APPROACH
		System.out.println(Second1(arr,n));     //Complexity: O(2*n)== O(n)
		
		// BRUTE FORCE APPROACH
		System.out.println(Second2(arr,n));   // Complexity : O(NlogN)
		
		// Best Approach
		System.out.println(Second3(arr,n));     // Complexity: O(N)
		

	}
public static int Second1(int[]arr, int n)
{
	int max1=arr[0];
	int max_index=0;
	int max2=arr[0];
	for(int i=0;i<n;i++)
	{
		if(arr[i]>max1)
		{
			max1=Math.max(arr[i], max1);
			max_index=i;
		}
	}
	arr[max_index]=-1;
	for(int i=0;i<n;i++)
	{
		if(arr[i]>max2 && arr[i]!=max1)
		{
			max2=Math.max(max2, arr[i]);
		}
	}
	return max2;
}

public static int Second2(int[]arr, int n)
{
	Arrays.sort(arr);
	return arr[n-1];
}
public static int Second3(int[]arr, int n)
{
	int large_one=arr[0];
	int large_sec=Integer.MIN_VALUE;
	for(int i=1;i<n;i++)
	{
		if(arr[i]>large_one)
		{
			large_sec=large_one;
			large_one=arr[i];
		}
		else if(arr[i]<large_one && arr[i]>large_sec)
		{
			large_sec=arr[i];
		}
	}
	return large_sec;	
}
}
