package array;
import java.util.*;
public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int target=sc.nextInt();
		Solve1(arr,n,target);  //O(n*n*n)
		Solve2(arr,n,target);  //O(n*n)
		Solve3(arr,n,target);  //O(n)

	}
public static void Solve1(int[]arr, int n, int target)
{
	int len=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{
			int sum=0;
			for(int k=i;k<=j;k++)
			{
				System.out.print(arr[k]+" ");
				sum=sum+arr[k];
				if(sum==target)
				{
					len=Math.max(len,j-i);
				}
				
			}
         System.out.println();
		}
	}
	System.out.println("Length="+len);
}
public static void Solve2(int[]arr, int n, int target)
{
	int len=0;
	for(int i=0;i<n;i++)
	{
		int sum=0;
		for(int j=i;j<n;j++)
		{		sum=sum+arr[j];
				if(sum==target)
				{
					len=Math.max(len,j-i+1);
				}				
		}     
	}
	System.out.println("Length="+len);
}
public static void Solve3(int[]arr, int n, int target)
{
	int len=0;
	int sum=arr[0];
	int i=0; int j=0;
	while(j<n)
	{
		while(i<=j && sum>target)
		{
			sum-=arr[i];
			i++;
		}
		if(sum==target)
		{
			len=Math.max(len, j-i+1);
		}
		j++;
		if(j<n)
			sum+=arr[j];
	}
	System.out.println("Length="+len);
}

}
