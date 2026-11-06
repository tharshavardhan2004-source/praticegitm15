package myprograms;

public class Parameter_asciii {
	
	static void call(String s)
	{
		
		String lc="";
		String num="";
		String sp="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				lc=lc+ch;	
			}
			else if(ch>='0' && ch<='9')
			{
				num=num+ch;
			}
			else
			{
				sp=sp+ch;
			}
			
			
		}
		System.out.println(lc);
		System.out.println(num);
		System.out.println(sp);
	
	}

	public static void main(String[] args)
	{
		call("tharshavardhan2004@gmail.com");
	}

}