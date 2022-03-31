package ch6.ExceptionHandling;
//try    
//catch
//finally               5 keywords
//throw
//throws
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int a = 5;
		int b = 0;
		int c = a/b;    //throwing the exception
		System.out.println(c);
		} catch(ArithmeticException e) {     //catching exception
			System.out.println(e.getMessage()+ " occured,please check your code");
		} finally {
			System.out.println("Sorry for the inconviniance");
		}
		
		System.out.println("Very imp code");
		System.out.println("Needs to run");
		 
		fun1();
	}
	
	 static void fun1() {
		 try {
		int a = 5;
		int b = 0;
		int c = a/b;    
		System.out.println(c);
		 }catch(ArithmeticException e){
			 System.out.println("solved");
		 }
	}

}
