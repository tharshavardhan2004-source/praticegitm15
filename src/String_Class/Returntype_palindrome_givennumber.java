package String_Class;

public class Returntype_palindrome_givennumber {
	static String ispalindrome()
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
			return ((copy==rev)? "Its a palindrome":"Its not a palindrome");
			
	}
	public static void main(String[] args)
	{
		String x=ispalindrome();
		System.out.println(x);
	}

}
