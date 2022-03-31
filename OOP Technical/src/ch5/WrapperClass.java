package ch5;

//In wrapper class primitive datatypes to be accessed as objects

//The points that can we remember
//1. the wrapper class do not contain any constructor
//2.the methods of wrapper class can be static
//3.after asssinging value the values to the wrappper class can not be a change
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(5);
		System.out.println(i);
		Double d = new Double(5.12);
		System.out.println(d);
		int num = i.intValue();
		System.out.println(num);
		
		String s = new String("Dhruv");
		System.out.println(s);
		
		s = Integer.toString(56);
		System.out.println(s);
		
		String str = "100";
		System.out.println(str);
		System.out.println(Integer.parseInt("100"));
	}

}
