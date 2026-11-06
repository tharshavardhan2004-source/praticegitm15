package Scanner_class_prgms;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Order_of_occurance_string 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the array values");
		for(int value = 0; value < arr.length; value++)
		{
			arr[value] = sc.nextInt();
		}
		LinkedHashMap<Integer, Integer> l=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int a=arr[i];
			if(!l.containsKey(a))
			{
				l.put(a,1);
			}
			else
			{
				int x=l.get(a);
				x++;
				l.put(a,x);
				
			}
		}
		for(Entry<Integer, Integer> k:l.entrySet())
		{
			System.out.println(k.getKey()+" "+k.getValue());
		}
		
	}

}
