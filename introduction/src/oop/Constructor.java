package oop;
class Vehical{
	int wheels;
	int headlights;
	String color;
//	Vehical(){   Default constructor
//		wheels = 0;
//	}
	
//	Vehical(){   
//		wheels = 4;
//	}
	
	Vehical(int wheels){
		this.wheels = wheels;
		headlights = 2;
	}
	Vehical(int wheels , String color){
		this.color = color;
		this.wheels = wheels;
		headlights = 2;
	}
}
public class Constructor {
	
	Constructor(){
		System.out.println("Object is now created");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Constructor is similer to method that is invoked automatically when an object is 
//		instantiated. Constructor are used to initialize the object.
//		
//		class Test{           It is similer to method . It ha
//			Test(){           and it constructor name is a class name
//				
//			}
//		}
		
//		If java constructor does not accept any parameters ,  it is no arg-constructor
		
//		class Test{
//			int a;
//			Test(){
//				a = 5;
//			}
//		}
		
//		If a java constructor accepts some parameter,It is parameteried constructor
		
//		class Test{
//			int a;
//			Test(int b){
//				a=b;
//			}
//		}
		
		
//		Constructor obj = new Constructor();
		
//		Vehical car = new Vehical();
//		Vehical car2 = new Vehical();
		
//		car.wheels = 4;
//		System.out.println(car.wheels);
//		System.out.println(car2.wheels);
		
		Vehical car = new Vehical(4);
		Vehical scooty = new Vehical(2);
		Vehical bike = new Vehical(2 , "black");
		
		System.out.println(car.wheels + " " + scooty.wheels);
		System.out.println(bike.wheels + " wheels and color = ");

	}
}
