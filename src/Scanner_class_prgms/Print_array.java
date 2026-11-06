package Scanner_class_prgms;

import java.util.Scanner;

public class Print_array {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}

}



 



	
