package array;
import java.util.*;
public class misiing_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(Missing(arr,n));			

	}
public static int Missing(int[]arr, int n)
{
	Arrays.sort(arr);
	int ans=n;
	for(int i=0;i<n;i++)
	{
		if(arr[i]!=i)
		{
			ans=i;
			break;
		}
	}
	return ans;
}
}
