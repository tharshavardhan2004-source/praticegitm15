package myprograms;

public class Reverse_a_word_in_sentence
{
	public static void main(String[] args)
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

}

