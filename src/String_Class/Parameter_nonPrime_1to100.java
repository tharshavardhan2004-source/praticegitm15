package String_Class;

public class Parameter_nonPrime_1to100 {
	static void isnotPrime(int start,int end)
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
			if(count!=2)
			{
				System.out.println(n);
			}
		}
	}
	public static void main(String[] args) {
		isnotPrime(1,100);
	}

}
