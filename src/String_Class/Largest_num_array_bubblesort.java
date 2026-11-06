package String_Class;

public class Largest_num_array_bubblesort {
	public static void main(String[] args) {
		int arr[]= {2,6,3,1,4,5};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Largest element is: " + arr[0]);
		
	}
	

}
