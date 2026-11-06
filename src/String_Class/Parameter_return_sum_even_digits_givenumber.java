package String_Class;

public class Parameter_return_sum_even_digits_givenumber 
{
	static int digit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			if(n%2==0)
			{
			sum=sum+rem;
			}
 			n=n/10;
		}
			
		return sum;
		
	}	
	public static void main(String[] args) {
		int x=digit(24176);
		System.out.println(x);
	}
}
