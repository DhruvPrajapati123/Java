package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
//		 There are two type of typecasting
//		1. atomatic typecasting
		
//		byte short char int long float double 
		
		int x = 4;
		
		double y = x;
		System.out.println(x);
		System.out.println(y);
		
//		2. manually typecasting(narrowing)
		
		double myDouble = 3.14;
		int myInt = (int)myDouble;
		
		System.out.println(myDouble);
		System.out.println(myInt);

	}

}
