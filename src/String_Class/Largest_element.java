package String_Class;

public class Largest_element {
	public static void main(String[] args) {
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
		

}
