package myprograms;

public class Calling_reverse_a_word
{
	static void call()
	{
		String s="Hi i am Harsha";
		String [] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i==2)
			{
				String s1=arr[i];
				String rev="";
				for(int j=s1.length()-1;j>=0;j--)
				{
					char ch=s1.charAt(j);
					rev=rev+ch;
				}
				System.out.print(rev+" ");	
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		call();
	
	}

}

