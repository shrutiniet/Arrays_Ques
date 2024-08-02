package Strivers_Sheet;
import java.util.Scanner;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("enter element to search");
		int ele=sc.nextInt();
		int found=-1;
		int start=0;
		int last=n-1;
		while(start<=last)
		{
			int mid=(start+last)/2;
			if(ele==arr[mid])
			{
				found=mid;
			    break;
			}
			else if(ele>arr[mid])
				start=mid+1;
			else
				last=mid-1;
		}
		if(found==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found at "+ found +" index");

	}
}
