package polymorphism;
//polymorphism means more than one forms
//There are 2 types:
//	Compile time and runtime polymorphism

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Pet p = d;
//		Animal a = d;
//		                   Run time polymorphism,Method overriding is runtime.overloading is
//							complietime.
//		d.walk();
//		p.walk();
//		a.walk();
		greetings();
		greetings("Hi");
		greetings("hi" , 5);
		System.out.println(d.name);
		System.out.println(p.name);
		
//		Variables are not override only method is overriding
	}
	
//	compile-time
	public static void greetings() {
		System.out.println("hi , There");
	}
	public static void greetings(String s) {
		System.out.println(s);
	}
	public static void greetings(String s , int count) {
		for(int i =0 ; i<count ; i++) {
			System.out.println(s);
		}
	}

}
