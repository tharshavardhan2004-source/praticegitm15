package String_Class;

public class Calling_prime 
{
	static void isPrime()
	{

		int n=12;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println((count==2)?"Is Prime number":"Not a prime number");
		
	}
	
	public static void main(String[] args) 
	{
		isPrime();
		
	}

}
