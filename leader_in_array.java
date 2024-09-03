package array;
import java.util.*;
public class leader_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//Solve1(arr,n);   // O(n*n)
		Solve2(arr,n);    // O(n)
	}
public static void Solve1(int[]arr, int n)
{
	ArrayList<Integer> list=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
		int val=arr[i];
		int count=0;
		for(int j=i;j<n;j++)
		{
			if(arr[j]>val)
			{
				count++;
			}
		}
		if(count==0)
			list.add(val);
	}
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}

}
public static void Solve2(int[]arr, int n)
{
	ArrayList<Integer> list=new ArrayList<>();
	int max=Integer.MIN_VALUE;
	for(int i=n-1;i>=0;i--)
	{
		if(arr[i]>max)
		{
			max=arr[i];
			list.add(max);
		}
	}
	for(int i=list.size()-1;i>=0;i--)
	{
		System.out.print(list.get(i)+" ");
	}
}
}
