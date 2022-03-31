package abstraction;

public class RepaireShop {
	
	public static void repairCar(car car) {
		System.out.println("Car is repaired");
	}
	
//	public static void repairCar(WegonR car) {
//		System.out.println("Car is repaired");
//	}
	
//	public static void repairCar(Audi car) {
//		System.out.println("Car is repaired");
//	}
	
	
	public static void main(String argc[]) {
		WegonR w = new WegonR();
		Audi a = new Audi();
		repairCar(w);
//		repairCar(a);
		
	}
}
