package Scanner_class_prgms;

import java.util.Scanner;

public class Armstrong_number {
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
			
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		System.out.println(copy==sum?"Armstrong number":"Not a Armstrong number");
	}

}
