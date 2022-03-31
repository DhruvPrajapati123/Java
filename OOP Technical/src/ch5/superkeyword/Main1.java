package ch5.superkeyword;
// here super() keyword is used for parent's method invocation

class Aclass{
	void fun() {
		System.out.println("Inside class A");
	}
}

class Bclass extends Aclass{
	void fun() {
		System.out.println("inside class B");
	}
	void display() {
		super.fun();
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bclass obj = new Bclass();
		obj.fun();
		obj.display();
	}

}
