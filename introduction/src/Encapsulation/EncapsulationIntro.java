package Encapsulation;
//we can achive encsptulation by packages and acccess modifires
//In encaptulation data fields and methods are to gather
//How we can achieve encapsulation?
//1.Declare the variables of class as a private
//2.Provide getter and setter methods that will be used to write and read these variables value
//3.That's it

public class EncapsulationIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student obj = new Student();
////		obj.name = "Tom";
////		obj.age = 17;
//		
//		obj.setAge(18);
//		System.out.println(obj.getAge());
		
		Student obj = new Student();
		obj.setAge(20);
		System.out.println(obj.getAge());
		obj.setName("Dhruv");
		
	}
}
