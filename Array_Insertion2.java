package array;
import java.util.*;
import java.util.ArrayList;
public class Array_Insertion2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter array size=");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter array ele=");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter position= ");
		int pos=sc.nextInt();
		if(pos<0 || pos>n+1)
		{
			System.out.println("Invalid position");
		}
		else
		{
			System.out.println("Enter ele= ");
			int ele=sc.nextInt();
			List<Integer> list=new ArrayList(Arrays.asList(arr));
			list.add(pos-1, ele);
			Integer[] n_arr=new Integer[n+1];
			n_arr=list.toArray(n_arr);
			System.out.println("After Insertion:");
			for(int i=0;i<n_arr.length;i++)
			{
				System.out.print(n_arr[i]+" ");
			}
		}
		
		// TODO Auto-generated method stub

	}

}
