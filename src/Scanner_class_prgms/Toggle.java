package Scanner_class_prgms;

import java.util.Scanner;

public class Toggle {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();		
		String tog="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				tog=tog+(char)(ch+32);
			}
			else if(ch>='a' && ch<='z')
			{
				tog=tog+(char)(ch-32);
			}
		}
		System.out.println(tog);
		
	}

}
