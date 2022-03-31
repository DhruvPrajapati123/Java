package conditionalStatements;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of petals");
		int noOfPetals = sc.nextInt();
		if(noOfPetals % 2 == 0) {
			System.out.println("he loves me not");
		}else {
			System.out.println("he loves me");
		}
		
//		ternary Operator
//		int a =15;
//		int b = 18;
//		int max = 0;
//		max = (a > b) ? a : b;
//		System.out.println("max is = " + max);
		
		
	}

}
