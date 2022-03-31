package exceptionHandling;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun1();
	}
	static void fun1(){
//		
		int a = 5;
		int b = 3;
		int c = a/b;
		try {
			fun2(); 
		}catch(Exception e) {
			System.out.println(e.getMessage() + " Occured");
		}
			
		
	}
	
	static void fun2() throws ArithmeticException {
		boolean isDanger = true;
		if(isDanger) {
			throw new ArithmeticException("Danger is coming");
		}
	}

}
