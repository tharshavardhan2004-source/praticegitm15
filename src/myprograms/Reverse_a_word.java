package myprograms;

public class Reverse_a_word
{
	public static void main(String[] args)
	{
		String s="Hi i am Harsha";
		String word="am";
		String [] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(word))
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

}

