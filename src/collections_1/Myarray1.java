package collections_1;

import java.util.ArrayList;

public class Myarray1 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		ArrayList b=new ArrayList();
		b.add('A');
		b.add('B');
		b.add('c');
		
		a.addAll(b);   //copy all elements from 1 coll to another collection
		System.out.println(a);
	}

}
