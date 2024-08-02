package array;
import java.util.Scanner;
import java.math.*;
public class Majority_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[] Hash=new int[10*n];
		for(int i=0;i<n;i++)
		{
			Hash[arr[i]]++;
		}
		int max=Integer.MIN_VALUE;		
		int max_val=arr[0];
		for(int i=0;i<n;i++)
		{
			if(Hash[i]>max)
			{
				max=Hash[i];
				max_val=i;
			}
			
		}
		System.out.println(max_val);
	}
}
