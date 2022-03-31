package strings;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String is non-primitive data-type and string is a class and string is immutable
//		immutable means does not change
//		String name = "Dhruv"; // store in string pool area
//		String surName = new String("Prajapati"); // store in heap area and make 
		                                          // copy in string pool area.
//		System.out.println(name);
//		System.out.println(surName);
		
		String name = "Satyam";
		String name1 = "Satyam";
		String anotherName = new String("Satyam");
		
		System.out.println(name == name1);
		System.out.println(name == anotherName);
//		
//		immutable
//		String s = "Dhruv";
//		s = "Dhruvs";
//		System.out.println(s);
		
		
	}

}
