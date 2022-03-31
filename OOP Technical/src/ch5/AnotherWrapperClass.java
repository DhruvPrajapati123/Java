package ch5;

public class AnotherWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		integer to string conversion
		
		int i = 100;
		String str = Integer.toString(i);
		System.out.println("Interger vale: " +i);
		System.out.println("Equivalance string value: "+str);
		
//		numeric string to interger number conversion
		
		String str1 = "200";
		int i1 = Integer.parseInt(str1);
		System.out.println("String value: "+str1);
		System.out.println("Equivalance int value: " + i1);
	}

}
