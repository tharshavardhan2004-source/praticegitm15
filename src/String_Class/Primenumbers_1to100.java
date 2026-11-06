package String_Class;

public class Primenumbers_1to100 {

	public static void main(String[] args) 
	{
		for(int i=1;i<100;i++)
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

}
