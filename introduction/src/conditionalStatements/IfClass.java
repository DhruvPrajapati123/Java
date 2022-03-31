package conditionalStatements;
import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age = ");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("You are eligible for voting");
		}
	}

}
