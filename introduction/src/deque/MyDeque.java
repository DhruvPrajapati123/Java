package deque;
//Using doubly link listed and we can also implement ArrayDeque using array. 

public class MyDeque<E> {
	
	public static class Node<E>{
		E data;
		Node<E> prev , next;
		
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}
	
	Node<E> head , tail;
	
	public void addToHead(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		head.prev = toAdd;
		toAdd.next = head;
		head = toAdd;
	}
	
	public void addToTail(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		tail.next = toAdd;
		toAdd.prev = tail;
		tail = toAdd;
	}
	
	public E removeFromHead() {
		if(head == null) {
			return null;
		}
		
		Node<E> toRemove = head;
		head = head.next;
		head.prev = null;
		
		if(head == null) {
			tail = null;
		}
		
		return toRemove.data;
	}
	
	public E removeFromTail() {
		if(head == null) {
			return null;
		}
		
		Node<E> toRemove = tail;
		tail = tail.prev;
		tail.next = null;
		
		if(tail == null) {
			head = null;
		}
		
		return toRemove.data;
	}
	
}
