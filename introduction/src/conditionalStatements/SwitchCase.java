package conditionalStatements;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number");
		int day = sc.nextInt();
		switch (day){
		case 1 : System.out.println("I am on leave");
			break;
		case 2 :System.out.println("I am in office");
			break;
		case 3: System.out.println(" i am playing football");	
			break;
		default : System.out.println("I don't know");	
		}

//		int rating = 2;
//		switch(rating) {
//		case 1:
//		case 2: System.out.println("bad");
//		break;
//		case 3:System.out.println("average");
//		break;
//		case 4:
//		case 5:System.out.println("good");
//		}
		
	}

}
