package ch6.ExceptionHandling;
//explicitly exception apvani hoy tyare
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      fun();
	}
	
	static void fun() {
		int a = 5;
		int b = 3;
		int c = a/b;
		System.out.println(c);
		
		try{fun1();}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void fun1() throws ArrayIndexOutOfBoundsException {
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
		}
	}

}
