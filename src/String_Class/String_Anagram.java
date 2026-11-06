package String_Class;

import java.util.Arrays;

public class String_Anagram {
	public static void main(String[] args)
	{
		String s="race";
		String s1="care";
		if(s.length()==s1.length())
		{
			s=s.toLowerCase();
			s1=s1.toLowerCase();
			char [] ch1=s.toCharArray();
			char [] ch2=s1.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			String s3=new String(ch1);
			String s4=new String(ch2);
			if(s3.equals(s4))
			{
				System.out.println("String anagram");
			}
			else {
				System.out.println("nOt a string anagram");
			}
		}
		else {
			System.out.println("Not a string anagram");
		}
		
	}
		

}
