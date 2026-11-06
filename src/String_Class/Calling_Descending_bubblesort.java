package String_Class;

public class Calling_Descending_bubblesort {
	static void sort()
	{
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
		for(int k=0;k<=arr.length-1;k++)
		{
			System.out.print(arr[k]+ " ");
		}
		
	}
	public static void main(String[] args) {
		sort();
	}
	

}
