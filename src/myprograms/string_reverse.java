package myprograms;

public class string_reverse 
{
	public static void main(String[] args) {
		String s="hi i am harsha";
		String [] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i==2)
			{
				String str=arr[i];
				String rev="";
				for(int j=str.length()-1;j>=0;j--)
				{
					char ch=str.charAt(j);
					rev= rev+ch;
				}
				System.out.println(rev+" ");
			}
			else
			{
				System.out.println(arr[i]+" ");
			}
		}
		
		
		
	}

}
