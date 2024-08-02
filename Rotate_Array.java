package array;
import java.util.Scanner;
public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter rotaion: ");
		int rot=sc.nextInt();
		if(rot>n)
			rot=n%rot;
		Left(arr,0,n-1);
		Left(arr,0,rot-1);
		Left(arr,rot,n-1);		
		System.out.println("After Rotation");
		for(int x:arr)
		System.out.print(x+" ");		
	}
public static void Left(int[]arr, int i, int j)
	{
		while(i<j)
		{
			int tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
			i++;
			j--;
		}		
	}
}
