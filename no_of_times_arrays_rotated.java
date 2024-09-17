package array;
import java.util.*;
public class no_of_times_arrays_rotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//System.out.println("ans="+Sol1(arr,n));
		System.out.println(Sol2(arr,n));

	}
public static int Sol1(int[]arr,int n)
{
	int min=0;
	for(int i=1;i<n;i++)
	{
		if(arr[min]>arr[i])
			min=i;;
	}
	return min;
}
public static int Sol2(int[]arr,int n)
{
	int low=0;
	int high=n-1;
	int index=-1;
	int ans=Integer.MAX_VALUE;
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(arr[low]<=arr[high])
		{
			if(arr[low]<ans)
			{
				index=low;
				ans=arr[low];
			}
			break;
		}			
		if(arr[low]<=arr[mid])
		{
			if(arr[low]<ans)
			{
				index=low;
				ans=arr[low];
			}
			low=mid+1;
		}
		else
		{
			if(arr[mid]<ans)
			{
				index=mid;
				ans=arr[mid];
			}
			high=mid-1;
		}
	}
	return index;
}
}

