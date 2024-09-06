package array;
import java.util.*;
public class longest_consecutive_sequence_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
	//	System.out.println(Solution1(arr,n));  //O(n*n)
	//	System.out.println(Solution2(arr,n));   //O(n)
		System.out.println(Solution3(arr,n));   //O(n)

	}
public static int Solution1(int[]arr, int n)
{
	int longest=1;
	int cnt=0;
	for(int i=0;i<n;i++)
	{
		int x=arr[i];
		cnt=1;
		while(Linear(arr,x+1)==true)
		{
			x=x+1;
			cnt++;			
		}
		longest=Math.max(longest, cnt);
	}
	return longest;
}
public static boolean Linear(int []arr, int target)
{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==target)
			return true;
	}
	return false;
}
public static int Solution2(int[]arr, int n)
{
	Arrays.sort(arr);
	int longest=1;
	int cnt=0;
	int last_smaller=Integer.MIN_VALUE;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==last_smaller+1)
		{
			cnt++;
			last_smaller=arr[i];
		}
		else if(arr[i]!=last_smaller)
		{
			cnt=1;
			last_smaller=arr[i];
		}
		longest=Math.max(longest, cnt);	
	}
	return longest;
}
public static int Solution3(int[]arr, int n)
{
	
	int longest=1;
	int cnt=0;
	Set<Integer> set=new HashSet<>();
	for(int i=0;i<n;i++)
	{
		set.add(arr[i]);
	}
	for(int it:set)
	{
		if(!set.contains(it-1))
		{
			cnt=1;
			int x=it;
			while(set.contains((x+1)))
			{
				x=x+1;
				cnt++;
			}
			longest=Math.max(longest, cnt);
		}
	}
	return longest;
}
}
