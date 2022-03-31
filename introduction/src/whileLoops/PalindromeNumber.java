package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		int temp =n;
		int r = 0;
		while(temp > 0) {
			int lastDigit = temp % 10;
			temp = temp / 10;
			r = r * 10 + lastDigit;
		}
		if(r == n) {
			System.out.println("The number " + n + " is Palindrome number");
		}else {
			System.out.println("The number " + n + " is not Palindrome number");
		}

	}

}
