package Scanner_class_prgms;

import java.util.Scanner;

public class swap_two_numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		 System.out.println(a+" After swap a value");
		 System.out.println(b+" After swap b value");
		   
	}

}
