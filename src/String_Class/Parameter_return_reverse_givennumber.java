package String_Class;

public class Parameter_return_reverse_givennumber 
{
	static int digit(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
		
	}
	public static void main(String[] args) 
	{
		int x=digit(9876);
		System.out.println(x);
		
	}

}
