package myprograms;

public class String_reverse_all_programs
{
	public static void main(String[] args)
	{
		String s="hello";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		
		System.out.println("=====================");
		System.out.println("1.Method with calling");
		sample1.call1();
	//========================
		System.out.println("=====================");
		System.out.println("2.Method with parameter");
		sample2.call2("Hello");
	//========================
		System.out.println("=====================");
		System.out.println("3.Method with return type");
		String x=sample3.call3();
		System.out.println(x);
	//========================
		System.out.println("=====================");
		System.out.println("3.Method with parameter And return type");
		String y=sample4.call4("Hello");
		System.out.println(y);
		
	}
	
}
//====================================
//Method with calling

class sample1
{
	static void call1()
	{

		String s="hello";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		
	}
}
//=====================
//Method with parameter

class sample2
{
	static void call2(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		
	}
	
}

//========================
//Method with return type
class sample3
{
	static String call3()
	{

		String s="hello";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		return rev;
		
	}
}


//=======================
//Method with parameter and return type
class sample4
{
	static String call4(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		return rev;
		
	}
	
}
