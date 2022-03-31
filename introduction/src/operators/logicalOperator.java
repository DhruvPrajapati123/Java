package operators;
import java.util.Scanner;

public class logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = sc.nextInt();
		if(num>=1 && num<=100) {
			System.out.println("Number is in the range");
		}else {
			System.out.println("Number is not in the range");
		}
		
		System.out.println("Enter the gread");
		int g = sc.nextInt();
		if(!(g==10 || g==12)) {
			System.out.println("you can give exam now");
		}
		
		System.out.println("Enter the marks: ");
		for(int i = 0 ; i<=100 ; i++) {
		int marks = sc.nextInt();
		if(marks>=90 && marks<=100) {
			System.out.println("Grade A");
		}else if(marks>=80 && marks<=89){
			System.out.println("Grade B");
		}else if (marks>70 && marks<=79) {
			System.out.println("Grade C");
		}else if (marks > 100) {
			System.out.println("Please enter the valid marks");
		}else {
			System.out.println("Fail");
		}}
	}

}
