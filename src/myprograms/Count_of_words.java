package myprograms;

public class Count_of_words 
{
	public static void main(String[] args) {
		String s="   Hi   i  am  ananthapur  ";
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
		System.out.println(count+1);
	}

}
