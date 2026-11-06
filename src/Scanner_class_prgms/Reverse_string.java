package Scanner_class_prgms;

import java.util.Scanner;

public class Reverse_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		String s=sc.next();
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			 char ch=s.charAt(i);
			 rev=rev+ch;
		}
		System.out.println(rev);
		
	}

}
