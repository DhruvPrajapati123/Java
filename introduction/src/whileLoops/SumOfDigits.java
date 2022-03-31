package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		while(temp > 0) {
			int lastDigit = temp % 10;
			temp = temp/10;
			sum = sum + lastDigit;
			System.out.println(lastDigit + " " + temp + " " + sum);
		}
		System.out.println("The of digits of " + n + " is = " + sum);
	}

}
