package conditionalStatements;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();

//		if(a>b) {
//			if(a>c) {
//				System.out.println(a + " is maximum number");
//			}else {
//				System.out.println(c + " is maximum number");
//			}
//		}else {
//			if(b>c) {
//				System.out.println(b + " is maximum number");
//			}else {
//				System.out.println(c + " is maximum number");
//			}
//		}
		int result = 0;
		result = a>b ? a>c ? a : c : b>c ? b:c;
		System.out.println("max is = " + result);
	}
	

}
