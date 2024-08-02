package Strivers_Sheet;
import java.util.*;
public class square_of_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=arr[i]*arr[i];
		}
		Arrays.sort(arr);
		System.out.println("array now");
		for(int x:arr)
			System.out.println(x);
	}
	

}
