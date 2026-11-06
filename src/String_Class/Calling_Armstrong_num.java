package String_Class;

public class Calling_Armstrong_num 
{
	static void armst()
	{
		int n=153;
		int copy=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		System.out.println((copy==sum)? "Armstrong number":"Not Armstrong number");
	}
	public static void main(String[] args) 
	{
		armst();
		
	}
}