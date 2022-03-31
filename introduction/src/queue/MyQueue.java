package queue;

import listInterface.MyLinkedList1.Node;;
//front : Pop :=> dequeue
//rear : push => enqueue

public class MyQueue<E> {
	private Node<E> front , rear;
	
	public void enqueue(E e) {
		Node<E> toAdd = new Node<>(e);
		
		if(front == null) {
			front = rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
	}
	
	public E dequeue() {
		
		if(front == null) {
			return null;
		}
		Node<E> temp = front;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		return temp.data;
	}
	public E peek() {
		if(front == null) {
			return null;
		}
		return (E) front.data;
	}
}
