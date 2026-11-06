package String_Class;

public class Calling_Largestelement_array
{
	static void large()
	{
		int [] arr= {8,3,9,1,5};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
			
	}
	public static void main(String[] args) 
	{
		large();
		
	}
		

}
