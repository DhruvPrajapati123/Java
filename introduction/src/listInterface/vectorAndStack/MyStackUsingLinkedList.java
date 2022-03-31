package listInterface.vectorAndStack;

import listInterface.MyLinkedList1;

public class MyStackUsingLinkedList<E> {

	private MyLinkedList1<E> ll = new MyLinkedList1<>();
	void push(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("popping from empty stack");
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("peeking from empty stack");
		}
		return ll.getLast();
	}
}
