package collections_1;

import java.util.ArrayList;

public class Myarray4 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ArrayList b=new ArrayList();
		b.add(50);
		b.add(60);
		b.add(20);
		b.add(30);
		a.removeAll(b);  //remove duplicates element from 1 collection to another collection
		System.out.println(a);
		System.out.println(b);
	}

}
