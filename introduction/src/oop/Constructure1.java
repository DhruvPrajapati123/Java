package oop;

class vehicle{
	int wheels;
	int hadeLights;
//	vehicle(){
//		wheels = 0;
//	}
//	vehicle(int noOfWheels){
//		hadeLights = 2;
//		wheels = noOfWheels;
//	}
	
	vehicle(int wheels){
		this.wheels = wheels;
	}
}

public class Constructure1 {

	Constructure1(){
		System.out.println("Object is now created");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle car = new vehicle(4);
		System.out.println(car.wheels);
		
		vehicle bike = new vehicle(2);
		System.out.println(bike.wheels);
	}

}
