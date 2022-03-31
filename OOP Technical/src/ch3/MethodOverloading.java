package ch3;

public class MethodOverloading {
	static void sum(int a , int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	static void sum(double a , double b) {
		double c = a + b;
		System.out.println(c);
	}
	
	static void sum(int a , int b , int c) {
		int d = a + b+ c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10,20);
		sum(50.32,54.35);
		sum(5,6,7);
		
	}

}
