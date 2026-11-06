package String_Class;

public class Return_largest_ele_array
{
	static int large()
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
		return max;

			
	}
	public static void main(String[] args) 
	{
		int x=large();
		System.out.println(x);
		
	}
		

}
