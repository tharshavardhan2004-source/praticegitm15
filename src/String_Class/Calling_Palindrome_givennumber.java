package String_Class;

public class Calling_Palindrome_givennumber 
{
	static void ispalindrome()
	{
			int n=121;
			int copy=n;
			int rev=0;
			while(n!=0)
			{
				int rem=n%10;
				rev=(rev*10)+rem;
				n=n/10;
			}
			if(copy==rev)
			{
				System.out.println("Its a palindrome");
			}
			else 
			{
				System.out.println("Its Not a palindrome");
			}
			
	}
	public static void main(String[] args)
	{
		ispalindrome();
	}
}
