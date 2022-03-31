package inheritance;

//Method Overriding: 
//	what happens if the same method is defined in both the superclass and subclass?
//	well,in this case,the method in the subclass override the methods in the superclass	

//UP casting and DOWN casting .here animal is parent class and cat is child class

//Up casting 
//	  Cat c = new Cat(); Sub class object
//    Animal a = c;  It's fine since Cat is also an animal

//Down casting
//	Cat c = new Cat();  Sub class object
//	Animal a = c; 
//	Cat c1 = (cat)a;
	


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p = t;
//		Teacher t = new Teacher();
//		Singer s = new Singer();
//		Person p = t;
//		Person p = t;
//		Teacher t1 = (Teacher)p;
//		boolean yo = t instanceof Teacher;
//		System.out.println(t instanceof Teacher);
//		System.out.println(s instanceof Singer);
//		System.out.println(t instanceof Person);
//		
//		System.out.println(t1 instanceof Person);
//		System.out.println(p instanceof Teacher);
		
//		t.name = "mr harry";
//		t.eat();
//		t.walk();
//		t.teach();
//		
//		Singer s = new Singer();
//		s.name = "xyz";
//		s.eat();
//		s.walk();
//		s.sing();
		
		Teacher t = new Teacher("mr harry");
		
		t.eat();
		}

}
