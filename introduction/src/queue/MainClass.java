package queue;
//import java.util.*;
//Functions : throwing exception add() , remove() , element()
//          : return false  / null offer() , poll() , peek()

public class MainClass {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<Integer> q = new LinkedList<>();
//		q.add(23);
//		q.add(2);
//		q.add(73);
//		q.add(63);
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.element());
//		System.out.println(q);
		
//		System.out.println(q.poll());
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(23);
		mq.enqueue(54);
		mq.enqueue(85);
		mq.enqueue(45);
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(56);
		System.out.println(mq.dequeue());
		
		mq.enqueue(23);
		mq.enqueue(78);
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
	}

}
