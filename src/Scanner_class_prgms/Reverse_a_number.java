package Scanner_class_prgms;

import java.util.Scanner;

public class Reverse_a_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int copy=n;
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(copy==rev?"Number palindrome":"Not a number palindrome");
	}

}
