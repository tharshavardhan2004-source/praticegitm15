package myprograms;

public class Parameter_return_count_words 
{
	
	static int call(String s)
	{
		s=s.trim();
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			char ch1=s.charAt(i);
			char ch2=s.charAt(i+1);
			if(ch1==' ' && ch2!=' ')
			{
				count=count+1;
			}	
		}
		return count+1;
	}
	public static void main(String[] args)
	{
		int x=call("   Hi   i  am  ananthapur  ");
		System.out.println(x);
	}

}
