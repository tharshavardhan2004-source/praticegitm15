package String_Class;

public class Return_strong_num 
{
	static String num()
	{
		int n=145;
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
		return ((copy==sum)?"Armstrong Number":"Not Armstrong number");
		
	}
	public static void main(String[] args) {
		String x=num();
		System.out.println(x);
	}

}
