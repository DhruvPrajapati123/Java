package conditionalStatements;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n < 10) {
			System.out.println("Number is less than 10");
		}else if(n>=10 && n<20) {
			System.out.println("Number is between 10 and 20");
		}else if(n>=20 && n<60) {
			System.out.println("number is between 20 and 60");
		}else {
			System.out.println("number is greterthan 60");
		}
	}

}
