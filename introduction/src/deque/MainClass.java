package deque;
//ArrayDeque implements Queue and deque
//import java.util.ArrayDeque;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
//		ad.addFirst(12);
//		ad.addFirst(24);
//		System.out.println(ad);
//		ad.pop();
//		System.out.println(ad.peek());
		
//		ad.push(23);
//		ad.push(2);
//		ad.push(73);
//		ad.push(33);
//		System.out.println(ad.pop());
//		System.out.println(ad.pop());
//		System.out.println(ad.pop());
		
		MyDeque<Integer> md = new MyDeque<>();
		md.addToHead(45);
		md.addToHead(78);
		md.addToTail(5);
		md.addToTail(98);
		System.out.println(md.removeFromHead());
		System.out.println(md.removeFromTail());
		System.out.println(md.removeFromHead());
		System.out.println(md.removeFromTail());
	}

}
