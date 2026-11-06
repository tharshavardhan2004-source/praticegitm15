package collections_1;

import java.util.PriorityQueue;

public class Priority_queue 
{
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(10);
		p.add(40);
		p.add(30);
		p.add(20);
		p.add(10);
		System.out.println(p);
		System.out.println("Top most element :"+p.peek());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
	}

}
