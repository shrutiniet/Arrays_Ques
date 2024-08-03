package Strivers_Sheet;
import java.util.Scanner;
public class element_that_occ_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(Sol1(arr,n));
		System.out.println(Sol2(arr,n));
		
}
public static int Sol1(int[]arr, int n)
{
	int ans=arr[0];
	for(int i=0;i<n;i++)
	{
		int count=0;
		for(int j=0;j<n;j++)
		{
			if(arr[i]==arr[j])
				count++;
		}
		if(count==1)
		{
			ans=arr[i];
			break;
		}
	}
	return ans;
}
public static int Sol2(int[]arr, int n)
{
	int xor=0;
	for(int i=0;i<n;i++)
	{
		xor^=arr[i];
	}
	return xor;
}
}
