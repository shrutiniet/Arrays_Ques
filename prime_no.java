package Strivers_Sheet;
import java.util.Scanner;
public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Prime1(n);  // O(n)
		// Prime2(n);    // O(log 2 n)
		Prime3(n); //O(sqrt(n))
		

	}
public static void Prime1(int n)
{
	int flag=0;
	for(int i=2;i<=n;i++)
	{
		if(n%i==0)
			flag++;
	}
	if(flag==1)
		System.out.println("Prime");
	else
		System.out.println("Not Prime");
}
public static void Prime2(int n)
{
	int flag=0;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
			flag++;
	}
	if(flag==1)
		System.out.println("Prime");
	else
		System.out.println("Not Prime");
}
public static void Prime3(int n)
{
	int flag=0;
	for(int i=1;i<=Math.sqrt(n);i++)
	{
		if(n%i==0)
			flag++;
	}
	if(flag==1)
		System.out.println("Prime");
	else
		System.out.println("Not Prime");
}
}
