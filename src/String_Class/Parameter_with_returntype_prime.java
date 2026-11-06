package String_Class;

public class Parameter_with_returntype_prime 
{
	static String isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return ((count==2)?"Is Prime number":"Not a prime number");
		
	}
	
	public static void main(String[] args) 
	{
		String x=isPrime(11);
		System.out.println(x);
		
	}

}
