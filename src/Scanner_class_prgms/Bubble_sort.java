package Scanner_class_prgms;

import java.util.Scanner;

public class Bubble_sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]= new int[size];
		for(int value = 0; value < arr.length; value++)
		{
			arr[value] = sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int k=0;k<=arr.length-1;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
	}
	

}
