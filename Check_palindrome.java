package Strivers_Sheet;
import java.util.Scanner;
public class Check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int check=n;
		while(n>0)
		{
			rev=rev*10+(n%10);
			n/=10;
		}
		if(rev==check)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		

	}

}
