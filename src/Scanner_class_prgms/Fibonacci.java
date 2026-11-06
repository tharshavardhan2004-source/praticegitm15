package Scanner_class_prgms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter n value:");
		int n1=0,n2=1,sum=0;
		System.out.println(n1);
		for(int i=1;i<=n-1;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}

}


