package Scanner_class_prgms;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Charaacter_order_of_occurance 
{
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the size of array:");
	        int size = sc.nextInt();

	        char arr[] = new char[size];
	        System.out.println("Enter the characters:");
	        for (int i = 0; i < arr.length; i++) 
	        {
	            arr[i] = sc.next().charAt(0);
	        }

	        LinkedHashMap<Character, Integer> l =new LinkedHashMap<Character, Integer>();
	        for (int i = 0; i < arr.length; i++)
	        {
	            char ch = arr[i];
	            if (!l.containsKey(ch)) {
	                l.put(ch, 1);
	            } 
	            else
	            {
	                int x = l.get(ch);
	                x++;
	                l.put(ch, x);
	            }
	        }

	        for (Entry<Character, Integer> k : l.entrySet()) {
	            System.out.println(k.getKey() + " " + k.getValue());
	        }
	    }

}
