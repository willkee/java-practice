package questThree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Checkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<Person> queue = new LinkedList<Person>();
		
		// Gives an order to elements, instead of order of insert
		Queue<Person> queue = new PriorityQueue<Person>();
		
		// add new Person to tail
		queue.offer(new Person());
		
		// Looks at head of queue, does not remove
		queue.peek();
		
		System.out.println(queue.size());
		// Remove head of queue ("pop")
		System.out.println(queue.poll());
		
		System.out.println(queue.size());
	}

}

class Person {
	
}