package myprograms;

public class Stringpalindrome_all_programs
{
	public static void main(String[] args) 
	{
		String s="mom";
		String rev="";
		for (int i =s.length()-1; i>=0; i--) 
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(s.equals(rev)?"Its a palindrome":"Its not a palindrpme");
		System.out.println("====================(Calling)");
		//Method with calling
		demo1.call1();
		
		System.out.println("====================(Parameter)");
		//Method with calling
		demo2.call2("Hello");
		
		System.out.println("====================(return type)");
		//Method with calling
		String x=demo3.call3();
		System.out.println(x);
		
		System.out.println("====================(parameter and return type)");
		//Method with calling
		String y=demo4.call4("madam");
		System.out.println(y);
		
	}
}

//Method with calling
class demo1
{
	static void call1()
	{
		String s="mom";
		String rev="";
		for (int i =s.length()-1; i>=0; i--) 
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(s.equals(rev)?"Its a palindrome":"Its not a palindrpme");
		
	}
	
}

//Method with parameter
class demo2
{
	static void call2(String s)
	{
		String rev="";
		for (int i =s.length()-1; i>=0; i--)  
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(s.equals(rev)?"Its a palindrome":"Its not a palindrpme");
		
	}
	
}

//Method with return type
class demo3
{
	static String call3()
	{
		String s="mom";
		String rev="";
		for (int i =s.length()-1; i>=0; i--)  
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		return (s.equals(rev)?"Its a palindrome":"Its not a palindrpme");	
	}
}

//Method with parameter and return type
class demo4
{
	static String call4(String s)
	{
		String rev="";
		for (int i =s.length()-1; i>=0; i--)  
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		return (s.equals(rev)?"Its a palindrome":"Its not a palindrpme");	
	}
}

