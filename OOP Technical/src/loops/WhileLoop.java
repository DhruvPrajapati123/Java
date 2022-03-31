package loops;
import java.util.*;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num = sc.nextInt();
//		int temp = num;
//		int reverse = 0;
//		
//		while(temp>0) {
//			int LastDigit = temp % 10;
//			temp /= 10;
//			reverse = reverse*10 + LastDigit;
//		}
//		if(reverse == num) {
//			System.out.println(num + " is plindromenumber");
//		}else {
//			System.out.println(num + " is not a palindromenumber");
//		}
		
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		int sum = 0;
//		int temp = n;
//		while(temp>0) {
//			int LastDigit = temp%10;
//			temp/= 10;
//			sum = sum + LastDigit;
//			System.out.println(LastDigit);
//		}
//		System.out.println("sum is = " + sum);
		int sum = 0;
		int n = 1;;
//		for(int i = 1 ; i<=10 ; i++) {
//			sum = sum +i;
//		}
		while(n <=10) {
			sum = sum + n;
			n++;
		}
		System.out.println(sum);
	}

}
