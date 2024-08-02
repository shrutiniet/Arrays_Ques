package Strivers_Sheet;
import java.util.*;
public class Max_min_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		System.out.println("maximum= "+ max);
		System.out.println("minimum= "+ min);
	}

}
