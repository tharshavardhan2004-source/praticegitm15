package String_Class;

public class Paramter_Return_largest_ele_array
{
	static int large(int [] arr)
	{
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
		int [] arr= {8,3,9,1,5};
		int x=large(arr);
		System.out.println(x);
		
	}
		

}
