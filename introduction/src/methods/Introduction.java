package methods;

//methodOverloading => when a class has two or more methods by the same name but different 
//parameters , it is known as methodOverloading

public class Introduction {

	public static void main(String[] args) {
		int firstNumber = 24;
		int secondNumber = 58;
		
		int result = maxOf(firstNumber , secondNumber);
		System.out.println(result);
		int  a = maxOf(200 , 400);
		int b = maxOf(100 , 89);
		System.out.println(a);
		System.out.println(+b);

		sayHi();
		sayHi();
		maxOf(5.0);
		
	}
	
	static int maxOf(int a , int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
//		return a>b? a : b;
	}
	
	static void maxOf(double c) {
		System.out.println("Good bye");
	}
	
	static void sayHi(){
		System.out.println("hi");
		System.out.println("Good Morning");
	}

}
