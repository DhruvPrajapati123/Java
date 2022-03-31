package ch5.superkeyword;
//super keyword vapri ne apde child class thi parent clss ne access kri sakhiye
//The super() is used to for parent's variable invocation
class A{
	int x = 10;
}

class B extends A{
	int x = 20;
	void display() {
		System.out.println(super.x);
	}
	void display1() {
		System.out.println(x);
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B objB = new B();
		objB.display();
		objB.display1();
		
	}

}
