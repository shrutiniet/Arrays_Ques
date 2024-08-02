package Strivers_Sheet;
import java.util.*;
public class Sorted_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr =new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//System.out.println(Sorted(arr,n));   // Simple one where array is either sorted or not  
		// Complexity: O(n)
		
		
		//Now sorted or not with Rotations
		System.out.println(Rotate(arr,n,0));
		
}
	public static boolean Sorted(int[]arr, int n)
	{
		boolean ans=true;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
				return false;			
		}
		return true;
	}
	public static boolean Rotate(int[]arr, int n, int rot)
	{
		if(rot==n)
		{
			return false;
		}
		boolean ans=Sorted(arr,n);
		if(ans==true)
			return true;
		else
		{
			int tmp=arr[n-1];
			for(int i=n-2;i>=0;i--)
			{
				arr[i+1]=arr[i];
			}
			arr[0]=tmp;
		}
		return Rotate(arr,n,rot+1);
	}
}
