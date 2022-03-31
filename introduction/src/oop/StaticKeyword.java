package oop;
//Static keyword is related to class.Does not change the value

//Static keyword is indicate that the perticular member belongs to a type itself ,rather than to 
//an instance(object) of that type. It is mainly used to help memory menegement.
//static keyword is applied  to variables , methods and block and nested class
public class StaticKeyword {
	
//	We can not declare a top level class with static modifier.but we can declare a nested class
//	as a static
//	In java u can define a class with-in another class.Such a class is called nested class
//	nested class are two types: static and non static
	
//	Static block
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//				System.out.println(Math.PI);
//		A objA = new A();
//		A.B objB =objA.new B();
//		
//		A.C objC = new A.C();
		
		System.out.println("Inside main");
		System.out.println("Inside main");
		System.out.println("Inside main");
	}
	static {
		System.out.println("In block1");
	}
	static {
		System.out.println("In block2");
	}
	static {
		System.out.println("in block 3");
	}
	
}

