package ch5.superkeyword;
// here super() keyword is used for parent's constructor invocation

class Aclass1{
	Aclass1(){
		System.out.println("Inside class A constructor");
	}
}
class Bclass1 extends Aclass1{
	Bclass1(){
		super();
		System.out.println("Inside class B constructor");
	}
}


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Aclass1 obj1 = new Aclass1();
		Bclass1 obj = new Bclass1();
	}

}
