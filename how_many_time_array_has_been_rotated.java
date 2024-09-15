package array;
import java.util.Scanner;
public class how_many_time_array_has_been_rotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(First(arr,n));

	}
public static int First(int[]arr, int n)
{
	int index=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]<arr[index])
		{
			index=i;
		}
	}
	return index;
}
}
