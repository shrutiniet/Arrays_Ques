package array;

import java.util.Scanner;

public class Spiral_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int minr=0;
		int minc=0;
		int count=0;
		int total_ele=m*n;
		while(count<total_ele)
		{
			for(int i=minc;i<=maxc && count<total_ele;i++)
			{
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			minr++;
			System.out.println();
			for(int i=minr;i<=maxr && count<total_ele;i++)
			{
				System.out.print(arr[i][maxc]+" ");
				count++;
			}
			maxc--;
			System.out.println();
			for (int i = maxc; i >= minc && count < total_ele; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;
			System.out.println();
			for (int i = maxr; i >= minr && count < total_ele; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;
			System.out.println();
		}
	}

}
