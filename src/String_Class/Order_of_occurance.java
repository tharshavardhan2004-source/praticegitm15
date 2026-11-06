package String_Class;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Order_of_occurance 
{
	public static void main(String[] args)
	{
		int arr[]= {4,8,2,1,8,2};
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
