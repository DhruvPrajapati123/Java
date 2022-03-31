package ch6.ExceptionHandling;
//Exception in java is an indication of some unusual event.
//five keywords: try , catch , finally , throw, throws
//try: the block of code that is to be monitered for the exception
//catch: the catch block handles the specific type of exception along with the try 
//block. try-catch block sathe ave
//finally: It specifies the code that must be executed evrn through exception
//may or may not occure
//throw: this keyword is used to throw specific exception from the program code
//throws: It specifies the exception that can be thrown by a particluar method
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a = 5;
		int b = 5/0;
		System.out.println(b);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("divide by 0");
		}
		System.out.println("Executed catch statement");
	}

}
