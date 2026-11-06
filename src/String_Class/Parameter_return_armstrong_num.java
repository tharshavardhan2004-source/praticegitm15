package String_Class;

public class Parameter_return_armstrong_num 
{
	static String armst(int n)
	{
		int copy=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		return ((copy==sum)? "Armstrong number":"Not Armstrong number");
	}
	public static void main(String[] args) 
	{
		String x=armst(153);
		System.out.println(x);
		
	}
}