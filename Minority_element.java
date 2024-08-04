package Strivers_Sheet;
import java.util.*;
public class Minority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[] hash=new int[n];
		for(int i=0;i<n;i++)
		{
			hash[arr[i]]++;
		}
		int min_count=n;
		int min_ele=-1;
		for(int i=0;i<n;i++)
		{
			if(hash[i]<min_count &&  hash[i]!=0)
			{
				min_count=hash[i];
				min_ele=i;
			}
		}
		System.out.println(min_ele);
	}
}
