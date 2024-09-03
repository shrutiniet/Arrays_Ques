package array;
import java.util.*;
public class rearrange_array_by_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		ArrayList<Integer> pos=new ArrayList<>();
		ArrayList<Integer> neg=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
				pos.add(arr[i]);
			else
				neg.add(arr[i]);
		}
		int pos_ele=0;
		int neg_ele=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				arr[i]=pos.get(pos_ele);
				pos_ele++;
			}
			else
			{
				arr[i]=neg.get(neg_ele);
				neg_ele++;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
