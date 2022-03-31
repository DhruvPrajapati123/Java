package abstraction;
//We can not created an object of abstract class
public abstract class car {
	public abstract void accelerate();
	                                         //Abstract methods here this methods can be override
	public abstract void breaking();
	
	public void honk() {
		System.out.println("Car is Honking");// Concrite methods
	}
}
