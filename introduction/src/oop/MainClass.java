package oop;

//Each java file has only one public class
//OOP has main 4 pillars : Abstraction , encaptulation , inheritance , polymophisom

class Cat{
	boolean hasFure;
	String color , breed;
	int legs , eyes;
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public void discription() {
		System.out.println("Cat has " + legs + " legs and " + eyes + " eyes");
	}
}
class Dog{
	String breed , name;
	public void jump() {
		System.out.println("my dog " + name + " jumped");
	}
	
	public void discription() {
		System.out.println("my dog name is " + name + " and its breed is " + breed);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		cat1.legs = 4;
//		cat1.eyes = 2;
//		cat2.legs = 4;
//		cat2.eyes = 1;
//		cat1.walk();
//		cat2.eat();
//		cat1.discription();
//		cat2.discription();
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.breed = "xyz";
		dog1.name = "Husky";
		dog2.breed = "pqr";
		dog2.name = "Bobby";
		
		dog1.jump();
		dog1.discription();
		
		dog2.jump();
		dog2.discription();
			
	}

}
