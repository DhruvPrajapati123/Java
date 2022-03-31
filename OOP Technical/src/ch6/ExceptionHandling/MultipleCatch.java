package ch6.ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[3];
		
		try {
		for(int i = 1;i<=3 ; i++) {
			a[i] = i*i;
		}
		for(int i =0;i<3 ;i++) {
			a[i] = i/i;
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
