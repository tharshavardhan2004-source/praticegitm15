package collections_1;

import java.util.ArrayList;

public class Myarray3 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("hi");
		a.add(false);   //the element is removed
		a.add('A');
		a.add(null);
		a.add(3.143f);
		
		
		
		a.remove(2);  //remove element based upon the index
		System.out.println(a);
		
		a.remove((Object)10);
		System.out.println(a); //the specified element is removed
	}

}
