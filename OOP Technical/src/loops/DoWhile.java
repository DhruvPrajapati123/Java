package loops;
import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum  = 0;
		do {
			sum = sum + n;
			System.out.println("Enter the number");
			n = sc.nextInt();
		}while(n!= -99);
		System.out.println(sum);
	}

}
