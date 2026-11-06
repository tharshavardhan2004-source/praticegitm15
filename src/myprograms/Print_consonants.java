package myprograms;

public class Print_consonants
{
	public static void main(String[] args)
	{
		String s="Qspiders";
		String conso="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' && ch!='a' && ch!='e' && ch!='i' && ch!='o'&& ch!='u')
			{
				conso=conso+ch;
			}
		}
		System.out.println(conso);
		System.out.println(conso.length());
		
	}

}
