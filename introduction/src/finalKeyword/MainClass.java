package finalKeyword;

//You can assign final keyword to  variabls , classes and methods

//1. A final variable can not be changed 
//2. A final methods can not be overridden
//3. A final class can not be extended
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final String name = "Dhruv";
//		
//		System.out.println(name);
		final Student obj1 = new Student();
		Student obj2 = new Student();
//		obj1 = obj2;
		obj1.name = "Dhruv";
	}

}
