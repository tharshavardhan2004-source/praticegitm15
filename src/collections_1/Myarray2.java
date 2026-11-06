package collections_1;

import java.util.ArrayList;

public class Myarray2 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		ArrayList b=new ArrayList();
		b.add('A');
		b.add('B');
		b.add('C');
		
		a.addAll(2, b);  //copy all elements from 1 coll to another collection at specified index
		System.out.println(a);
	}

}
