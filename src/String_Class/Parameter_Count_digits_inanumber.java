package String_Class;

public class Parameter_Count_digits_inanumber 
{
	static int values(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int x=values(538274);
		System.out.println(x);
	}

}
