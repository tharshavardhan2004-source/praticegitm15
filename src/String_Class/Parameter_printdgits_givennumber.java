package String_Class;

public class Parameter_printdgits_givennumber 
{
	static void digit(int n)
	{
		
		while(n!=0)
		{
			int rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
		
	}
	public static void main(String[] args) {
		digit(123);
	}
	
			
			
}
