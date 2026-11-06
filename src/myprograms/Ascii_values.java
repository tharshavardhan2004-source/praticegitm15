package myprograms;

public class Ascii_values 
{
	public static void main(String[] args) 
	{
		System.out.println("Upper case letters");
		S1.call1();
		System.out.println("=================");
		
		System.out.println("Lower case letters");
		S2.call2();
		System.out.println("=================");
		
		System.out.println("Numbers");
		S3.call3();
		System.out.println("=================");
	}

}
class S1
{
	static void call1()
	{
		for(int i=65;i<=90;i++)
		{
			System.out.println((char)i);
		}
	}
}

class S2
{
	static void call2()
	{
		for(int i=97;i<=122;i++)
		{
			System.out.println((char)i);
		}
	}
}

class S3
{
	static void call3()
	{
		for(int i=48;i<=57;i++)
		{
			System.out.println((char)i);
		}
	}
}
