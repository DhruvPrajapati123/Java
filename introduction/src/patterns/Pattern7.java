package patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rows = 2*n - 1;
		
		for(int i = 1;i<=rows ; i++) {
			if(i<=n) {
				for(int j = 1;j<=i;j++) {
					System.out.print("* ");
				}
			}else {
				for(int k = 1;k<=rows-i+1;k++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
