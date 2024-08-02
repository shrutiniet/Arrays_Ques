package Strivers_Sheet;
import java.util.*;
public class Kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int Max_Sum=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			Max_Sum=Math.max(Max_Sum, sum);	
			if(sum<0) 
				sum=0;
					
		}
		System.out.println("maximum sum= "+ Max_Sum);

	}

}
