package methods;
//java is pass by value language
//in primitive type new copy generated and in non primitive type refrence are passed

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int c  = 45;
//		int d = 12;
//		swap(c , d);
//		System.out.println("c = " + c + " d = " + d);
		
		Dog c = new Dog();
		c.legs = 4;
		Dog d = new Dog();
		d.legs = 3;
		swap(c,d);
		System.out.println(c.legs + " " + d.legs);
	}
	
	static void swap(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
		
	}
	
	static void swap(Dog a , Dog b) {
		Dog temp = a;
		a = b;
		b = temp;
		
	}
}

class Dog{
	int legs;
}
