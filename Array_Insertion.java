package array;
import java.util.*;
public class Array_Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size= ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter new ele position");
		int pos=sc.nextInt();
		if(pos<0 || pos>size+1)
		{
			System.out.println("Invalid Position");
		}
		else
		{
			System.out.println("Enter element: ");
			int ele=sc.nextInt();
			int[] new_array=new int[size+1];
			for(int i=0;i<size+1;i++)
			{
				if(i<pos-1)
					new_array[i]=arr[i];
				else if(i==pos-1)
					new_array[i]=ele;
				else
					new_array[i]=arr[i-1];
			}
			System.out.println("After Insertion Array= ");
			for(int i=0;i<size+1;i++)
			{
				System.out.print(new_array[i]+" ");
			}
		}
		

	}

}
