package myprograms;

public class Toggle
{
	public static void main(String[] args)
	{
		String s="JaVa";
		String tog="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				tog=tog+(char)(ch+32);
			}
			else if(ch>='a' && ch<='z')
			{
				tog=tog+(char)(ch-32);
			}
		}
		System.out.println(tog);
		
	}

}
