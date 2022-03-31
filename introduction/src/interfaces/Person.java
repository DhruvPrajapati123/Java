package interfaces;

//similar to abstract classes , interfaces help us to achieve abstraction in java
//In java, Multiple inheritance is not possible by extending the classes.However a class can implement
//multiple interfaces.This allow us to get functionality of multiple inheritance in java.
//ex 
//interface Line{
//	
//}
//interface Polygon{
//	
//}
//class Ractangle implements Line , Polygon{
//	
//}
public class Person implements Student , Youtuber{
	public static void main(String argc[]) {
		Person p = new Person();
		p.study();
		p.makeVideo();
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Person is studing");
	}

	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("Person is making video");
	}
}
