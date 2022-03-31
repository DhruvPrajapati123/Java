package exceptionHandling;

//java is a object oriented programming language,whenever an error accures while excuting the
//statement, Create an exception object. The exception object containes a lot of dibugging 
//information such as line number , method hirchachy , where excrption accure and type of exception

//When exception occure in the method,The process of creating the exception object and handling it
//over runtime environment is called throwing the exception

//If appropriate exception handler is found, exception object is passed to the handler to process it
//The handler is said to be catching the exception

//The method call stack is a-b-c and exception raised in method c , then search for appropriate handler
//will movefrom c-b-a.
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int a = 5;
//			int b = 0;
//			int c = a/b;
//			System.out.println(c);
			
			int a[] = new int[5];
			System.out.println(a[5]);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " occured , please check your code");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index should be in range of 0 to size of array");
		} catch(StringIndexOutOfBoundsException e){
			System.out.println("String index out of bound");
		} finally{ 											// always run
			System.out.println("Sorry of , inconviance");
		}
		System.out.println("Very Imp code");
		System.out.println("Need to run");
		
		fun1();
		
	}
	static void fun1(){
//		try {
//			int a = 5;
//			int b = 3;
//			int c = a/b;
//			System.out.println(c);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
		int a = 5;
		int b = 3;
		int c = a/b;
		
		boolean isDanger = true;
		if(isDanger) {
			throw new ArithmeticException("Danger is coming");
		}
	}
}
