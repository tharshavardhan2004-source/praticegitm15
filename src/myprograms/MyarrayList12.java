package myprograms;

import java.util.ArrayList;

public class MyarrayList12
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		 a.add(10);
		 a.add("Hi");
		 a.add(273.76);
		 a.add(null);
		 a.add('A');
		 a.add(true);
		 System.out.println(a);
		 a.add(2, 100);
		 System.out.println(a);//add an element based on index
		
	}

}
