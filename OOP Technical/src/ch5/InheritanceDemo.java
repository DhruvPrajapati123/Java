package ch5;
class A{
	int a;
	void set_ValueA(int a) {
		this.a = a;
	}
	void get_ValueA() {
		System.out.println("The value of a: " + a);
	}
}

class B extends A{
	int b;
	void set_ValueB(int b) {
		this.b = b;
	}
	void get_ValueB() {
		System.out.println("The value of b: " + b);
	}
	
	void multipiction() {
		int c = a*b;
		System.out.println("The value of c: " + c);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B objB = new B();
		objB.set_ValueB(56);
		objB.set_ValueA(10);
		objB.get_ValueA();
		objB.get_ValueB();
		objB.multipiction();
	}

}
