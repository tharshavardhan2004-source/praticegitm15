package String_Class;

public class Calling_sum_evennumbers 
{
	static void digit()
	{
		int n=1236;
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
			
		System.out.println(sum);
		
	}	
	public static void main(String[] args) {
		digit();
	}
}
