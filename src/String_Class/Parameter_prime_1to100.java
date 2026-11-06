package String_Class;

public class Parameter_prime_1to100 
{
	static void isPrime(int start,int end)
	{

		for(int i=start;i<end;i++)
		{
			int n=i;
			int count=0;
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n);
			}
		}
	}
	public static void main(String[] args) {
		isPrime(1,100);
	}


}
