package ch6.ExceptionHandling;

public class NestedTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	 int a = Integer.parseInt(args[0]);
	 int b = Integer.parseInt(args[1]);
	 int ans  = 0;
		
	 ans = a/b;
	 System.out.println(ans);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Incorrect type of data");
		}
	}

}
