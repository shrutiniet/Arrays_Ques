package array;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter ele to search= ");
		int ele=sc.nextInt();
		int flag=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==ele)
			{
				flag=i;
				break;
			}
		}
		if(flag==-1)
		{
			System.out.println("Ele not found");
		}
		else
			System.out.println("Ele found at "+ flag +" index");

	}

}
