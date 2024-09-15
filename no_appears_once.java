package array;
import java.util.Scanner;
public class no_appears_once {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//System.out.println(First(arr,n));  //O(n)
		System.out.println(Second(arr,n));
		System.out.println(Third(arr,n));

	}
public static int First(int[]arr, int n)
{
	int ans=-1;
	if(n==1) return arr[0];
	for(int i=1;i<n-1;i++)
	{
		if(i==0 && (arr[i]!=arr[i+1]))
			return arr[0];
		else if(i==n-1 && arr[n-1]!=arr[n-2])
			return arr[n-1];
		else
		{
			if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
				return arr[i];
		}			
	}
	return ans;
}
public static int Second(int[]arr, int n)
{
	int xor=0;
	for(int i=0;i<n;i++)
	{
		xor=xor^arr[i];
	}
	return xor;
}
public static int Third(int[] arr,int n)
{
	int low=0;
	int high=n-1;
	if(n==1 || arr[0]!=arr[1])
		return arr[0];
	if(arr[n-1]!=arr[n-2])
		return arr[n-1];
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
			return arr[mid];
		else if((mid%2==1 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]==arr[mid+1]))
			low=mid+1;
		else
			high=mid-1;
	}
	return -1;
}
}

