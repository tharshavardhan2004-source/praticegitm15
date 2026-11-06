package Scanner_class_prgms;

import java.util.Scanner;

public class Strong_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int copy=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		System.out.println(copy==sum?"strong number":"strong number");
	}

}
