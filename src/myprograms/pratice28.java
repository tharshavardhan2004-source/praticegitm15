package myprograms;

public class pratice28 
{
	public static void main(String[] args) 
	{
		String s="   Hi  i  am  harsha";
		s=s.trim();
		String [] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(i==2)
			{
				String s1=str[i];
				String rev="";
				for(int j=s1.length()-1;j>=0;j--)
				{
					char ch=s1.charAt(j);
					rev=rev+ch;
				}
				System.out.println(rev+" ");
			}
			else {
				System.out.println(str[i]);
			}
		}
		
	}
}
