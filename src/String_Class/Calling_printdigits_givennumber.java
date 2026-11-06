package String_Class;

public class Calling_printdigits_givennumber 
{
	static void digit()
	{
		int n=123;
		while(n!=0)
		{
			int rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
		
	}
	public static void main(String[] args) {
		digit();
	}
	
			
			
}
