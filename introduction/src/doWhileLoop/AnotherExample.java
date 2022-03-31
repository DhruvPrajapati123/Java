package doWhileLoop;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner sc = new Scanner(System.in);
		do {
			 n = sc.nextInt();
			System.out.println("The number is "+n);
		}while(n!=0);
		
	}
}
