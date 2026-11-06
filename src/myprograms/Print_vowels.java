package myprograms;

public class Print_vowels
{
	public static void main(String[] args)
	{
		String s="Qspiders";
		String vow="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vow=vow+ch;
			}
		}
		System.out.println(vow);
		System.out.println(vow.length());
		
	}

}
