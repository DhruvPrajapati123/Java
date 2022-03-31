package listInterface;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> obj = new LinkedList<>();
//		obj.add(12);
//		obj.add(2);
//		obj.add(52);
//		obj.add(17);
////		obj.toArray();
//		System.out.println(obj);
		
//		List<Integer> obj = new ArrayList<>();
//		obj.add(12);
//		obj.add(2);
//		obj.add(52);
//		obj.add(17);
//		System.out.println(obj);
		
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		getTimeDiff(ll);
//		getTimeDiff(al);
		
		MyLinkedList1<Double> myLL = new MyLinkedList1<>();
//		myLL.add(12);
//		myLL.add(23);
//		myLL.add(54);
		for(double i = 0 ; i<=20 ; i++) {
			myLL.add(i);
		}
		myLL.print();
	}

	static void getTimeDiff(List<Integer> list) {
		long start = System.currentTimeMillis();
		
		for(int i = 0 ; i <= 100000 ; i++) {
			list.add(0 , i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() + " " + (end - start));
//		System.out.println(list);
	}
}
