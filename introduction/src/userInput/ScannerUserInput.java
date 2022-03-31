package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int x = sc.nextInt();
//		System.out.println(x);
//		System.out.println("Enter the second number");
//		double y = sc.nextDouble();
//		System.out.println(y);
//		System.out.println("Enter the string");
//		String str = sc.nextLine();
//		System.out.println(str);
		System.out.println("Enter the principal");
		int principal = sc.nextInt();
		
		System.out.println("Enter the interest rate");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time");
		int time = sc.nextInt();
		
		double simpleInterest = principal * rate * time / 100;
		
		System.out.println("The simple interest is = " + simpleInterest);
		
		
	}

}
