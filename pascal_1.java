package array;

import java.util.Scanner;

public class pascal_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int clm=sc.nextInt();
		int ans=NCR(row-1,clm-1);
		System.out.println(ans);

	}
public static int NCR(int n, int r)
{
	int res=1;
	for(int i=0;i<r;i++)
	{
		res=res*(n-i);
		res=(int)res/(i+1);				
	}
	return res;
}
}
