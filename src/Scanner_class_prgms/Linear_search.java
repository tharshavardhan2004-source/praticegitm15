package Scanner_class_prgms;

import java.util.Scanner;

public class Linear_search {

	static void search(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("element found");
			    return ;
			}
		}
		System.out.println("element not found");	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the array values");

		for(int value = 0; value < arr.length; value++)
		{
			arr[value] = sc.nextInt();
		}
		System.out.println("Enter key value to search in array");
		int key=sc.nextInt();
		search(arr,key);
	}

}
