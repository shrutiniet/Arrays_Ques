package Strivers_Sheet;
import java.util.Scanner;
public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter element to search= ");
		int ele=sc.nextInt();
		int found=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==ele)
				found=i;
		}
		if(found==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found at "+ found +" index");
	}

}
