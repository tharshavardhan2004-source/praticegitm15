package collections_1;

import java.util.Vector;

public class Myvector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add("Hi");
		v.add(false);
		v.add('B');
		v.add(10);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
	}

}
