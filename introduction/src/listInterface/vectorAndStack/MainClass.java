package listInterface.vectorAndStack;
//import java.util.*;
//synchronized keyword hoy che Vector ma operation ne thread safe krva mte
//Stack extends vector

public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Vector<Integer> v = new Vector<>();
//		v.add(12);
//		v.add(23);
//		System.out.println(v);
		
//		operation in stack: push(dataType data) , pop() , peek() , search() , empty().
		
		MyStackUsingLinkedList<Integer> s = new MyStackUsingLinkedList<>();
		s.push(12);
		s.push(14);
		s.push(56);
//		System.out.println(s);
		System.out.println(s.pop());
//		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
//		System.out.println(s.pop());
		
	}

}
