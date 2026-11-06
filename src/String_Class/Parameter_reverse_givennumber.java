package String_Class;

public class Parameter_reverse_givennumber 
{
	static void digit(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		
	}
	public static void main(String[] args) 
	{
		digit(9876);
		
	}

}
