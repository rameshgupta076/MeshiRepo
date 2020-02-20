package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.function.UnaryOperator;

public class LinkedListDemo {

	LinkedList ls = new LinkedList();
	
	
	void add() {

		ls.add("Ramesh");
		ls.add("Rudra");
		ls.add("Vedu");
		ls.add("Gupta");
		ls.add("Mahavir");
		ls.add("Enclave");
		System.out.println(ls);
		
		ls.addFirst("FirstNew");
		ls.addLast("Last");
		
		System.out.println(ls.peek());
		System.out.println(ls.peekFirst());
		ls.set(1, "Valine");
		ls.offerFirst("OfferFirst");
		Collections.replaceAll(ls,"Vedu","Ramesh");
		
		
	}

	public static void main(String[] args) {

		LinkedListDemo ld = new LinkedListDemo();
		ld.add();
		System.out.println(ld.ls);
		
		
		
		
	}
}
