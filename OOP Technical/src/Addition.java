import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string = ");
		String st = sc.nextLine();
//		convert string into  int
		int input = Integer.parseInt(st);
		System.out.println(input);
		
		System.out.println("Enter First number = ");
		int first = sc.nextInt();
		System.out.println("Enter Second number = ");
		int second = sc.nextInt();
		
		int c = first + second;
		
		System.out.println("The sum of " + first + " and " +second + " is = " + c);
		
	}

}
