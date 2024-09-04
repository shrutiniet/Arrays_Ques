package array;
import java.util.*;
public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int target=sc.nextInt();
		//Solution1(arr,n,target); // O(n*n)
	    //Solution2(arr,n,target); //O(n)
		//now two pointer approach
		Solution3(arr,n,target);   // O(n)
	}
public static void Solution1(int arr[], int n, int target)
{
	int first_index=0;
	int sec_index=1;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j) 
				continue;
			if((arr[i]+arr[j])==target)
			{
				first_index=j;
				sec_index=i;
			}
		}
	}
	System.out.println(first_index+" "+ sec_index);
}
public static void Solution2(int arr[], int n, int target)
{
	int first_index=0;
	int sec_index=1;
	HashMap<Integer, Integer> map=new HashMap<>();
	for(int i=0;i<n;i++)
	{
		int num=arr[i];
		int moreneeded=target-num;
		if(map.containsKey(moreneeded))
		{
			first_index=map.get(moreneeded);
			sec_index=i;
		}
		map.put(arr[i],i);
	}
	System.out.println(first_index+" "+sec_index);
	
}
public static void Solution3(int[]arr, int n, int target)
{
	Arrays.sort(arr);
	int first_index=0;
	int sec_index=0;
	int left=0;
	int right=n-1;
	while(left<right)
	{
		int sum=arr[left]+arr[right];
		if(sum==target)
		{
			first_index=left;
			sec_index=right;
		}
		else if(sum<target)
			left++;
		else
			right--;
	}
	System.out.println(first_index+" "+sec_index);
}
}
