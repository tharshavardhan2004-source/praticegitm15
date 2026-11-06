package myprograms;

public class Char_ReverseString
{
	public static void main(String[] args) {
		String s="Hello";
		for (int i =s.length()-1; i>=0; i--) 
		{
			System.out.println(s.charAt(i));
			
		}
		System.out.println("===============");
		System.out.println("1.Method with parameter");
		sample.rev("Hello");
		
	}

}

//======================
//Method with parameter
class sample
{
	static void rev(String s)
	{
		for (int i =s.length()-1; i>=0; i--) 
		{
			System.out.println(s.charAt(i));
		
		}
	}
	
}
