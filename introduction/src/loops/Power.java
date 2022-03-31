package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int a = sc.nextInt();
		System.out.println("Enter the reapeat: ");
		int b =sc.nextInt();
		int r = 1;
		for(int i = 0;i<b ; i++) {
			r = r*a;
		}
		System.out.println(r);
		
	}

}
