package myprograms;

public class parameter_return_consonents
{
	static String call(String s)
	{
		String conso="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' && ch!='a' && ch!='e' && ch!='i' && ch!='o'&& ch!='u')
			{
				conso=conso+ch;
			}
		}
		return conso;
	}
	public static void main(String[] args) {
		String x=call("Qspiders");
		System.out.println(x);
	}

}
