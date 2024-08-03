package Strivers_Sheet;
import java.util.*;
public class move_zwroes_to_end {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//Solution1(arr,n);   // Complexity: O(n)
		
		// TWO POINTER APPROACH
		
		Solution2(arr,n);
		
	}
public static void Solution1(int[]arr, int n)
{
	int k=0;
	int[] ans=new int[n];
	for(int i=0;i<n;i++)
	{
		if(arr[i]!=0)
		{
			ans[k]=arr[i];
			k++;
		}
	}
	
}
public static void Solution2(int[]arr, int n)
{
	int j=-1;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==0)
		{
			j=i;
			break;
		}
	}
	for(int i=j+1;i<n;i++)
	{
		if(arr[i]!=0)
		{
			int tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
			j++;
		}
	}
	for(int x: arr)
		System.out.print(x+" ");
}
}
