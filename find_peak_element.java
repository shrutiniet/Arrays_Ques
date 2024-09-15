package array;
import java.util.*;
public class find_peak_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
	//	System.out.println(Sol1(arr,n));
		System.out.println(Sol2(arr,n));
	}
public static int Sol1(int[]arr, int n)
{
	int ans=-1;
	for(int i=0;i<n;i++)
	{
		if((i==0 && arr[i-1]<arr[i]) || (i==n-1 && arr[i]>arr[i+1]))
		{
			ans=i;
		}
	}
	return ans;
}
public static int Sol2(int[]arr, int n)
{
	if(n==1)
		return 0;
	if(arr[0]>arr[1])
		return 0;
	if(arr[n-1]>arr[n-2])
		return n-1;	
	int low=0;
	int high=n-1;
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
			return mid;
		else if(arr[mid]>arr[mid-1])
			low=mid+1;
		else
			high=mid-1;
	}
	return -1;
}
}
