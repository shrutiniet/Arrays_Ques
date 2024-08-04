package Strivers_Sheet;
import java.util.*;
public class union_of_arrays {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m=");
		int m=sc.nextInt();
		int[] arr1=new int[m];
		for(int i=0;i<m;i++)
			arr1[i]=sc.nextInt();
		System.out.println("Enter n=");
		int n=sc.nextInt();
		int[] arr2=new int[n];
		for(int i=0;i<n;i++)
			arr2[i]=sc.nextInt();
		ArrayList<Integer> AL=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
				if(!AL.contains(arr1[i]))
				{
					AL.add(arr1[i]);
				}
				i++;
			}
			else if(arr2[j]<arr1[i])
			{
				if(!AL.contains(arr2[j]))
				{
					AL.add(arr2[j]);
				}	
				j++;
			}
			else
			{
				if(!AL.contains(arr2[j]))
				{
					AL.add(arr2[j]);
				}	
				j++;
				i++;
			}
		}
		while(i<m)
		{
			if(!AL.contains(arr1[i]))
			{
				AL.add(arr1[i]);
			}
			i++;
		}
		while(j<n)
		{
			if(!AL.contains(arr2[j]))
			{
				AL.add(arr2[j]);
			}
			j++;
		}
		System.out.println("Union = ");
		for(int k=0;k<AL.size();k++)
		{
			System.out.print(AL.get(k)+" ");
		}		
	}

}
