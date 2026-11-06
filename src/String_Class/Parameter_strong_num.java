package String_Class;

public class Parameter_strong_num 
{
	static void num(int n)
	{
		int copy=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(copy==sum)
		{
			System.out.println("Its a Strong number");
		}
		else 
		{
			System.out.println("Its a not Strong number");
		}
		
	}
	public static void main(String[] args) {
		num(145);
	}

}
