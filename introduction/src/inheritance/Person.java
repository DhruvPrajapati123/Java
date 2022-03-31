package inheritance;

//Super Keyword: In java super keyword is used to refer  to immidiate parent class of child class
//In other words super keyword is used by  a subclass whenever  it needs to refer to its
//immidiate  super class

//child class se parent class access krna hai to super keyword use krna chahiye

public class Person {
	public Person(String name) {
		this.name = name;
		System.out.println("inside person const");
	}
	protected String name;
	
	public void walk() {
		System.out.println("Person" + name + " is walking");
	}
	
	public void eat() {
		System.out.println("Person" + name + " is eating");
	}
	
	public static void laugh() {
		System.out.println("Person is laughing");
	}
}
