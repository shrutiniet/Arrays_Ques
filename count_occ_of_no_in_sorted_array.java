package array;
import java.util.*;
public class count_occ_of_no_in_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter X= ");
		int X=sc.nextInt();
		//System.out.println(Count(arr,n,X));
		System.out.println(Count1(arr,n,X));

	}
public static int Count(int[]arr, int n, int X)
{
	int ans=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==X)
			ans++;
	}
	return ans;
}
public static int Count1(int[]arr, int n, int X)
{
	int first=Firstocc(arr,n,X);
	if(first==-1)
		return 0;
	int last=Lastocc(arr,n,X);	
	return last-first+1;
}
public static int Firstocc(int[]arr, int n, int X)
{
	int first=-1;
	int low=0;
	int high=n;
	while(low<=high)
	{
			int mid=(low+high)/2;
			if(arr[mid]==X)
			{
				first=mid;
				high=mid-1;
			}
			else if(arr[mid]<X)
				low=mid+1;
			else
				high=mid-1;
	}
	return first;
}
public static int Lastocc(int[]arr, int n, int X)
{
	int last=-1;
	int low=0;
	int high=n;
	while(low<=high)
	{
			int mid=(low+high)/2;
			if(arr[mid]==X)
			{
				last=mid;
				low=mid+1;
			}
			else if(arr[mid]<X)
				low=mid+1;
			else
				high=mid-1;
	}
	return last;
}	
}
