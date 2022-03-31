package array;

import java.util.Scanner;

public class Transpose1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		int b[][] = new int[col][row];
		
		for(int i = 0;i<=row-1;i++) {
			for(int j = 0;j<=col-1;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0;i<=row-1;i++) {
			for(int j = 0;j<=col-1;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0;i<=row-1;i++) {
			for(int j = 0;j<=col-1;j++) {
				 b[j][i] = a[i][j]; //IMP
			}
		}
		
		for(int i = 0;i<=col-1;i++) {
			for(int j = 0;j<=row-1;j++) {
				System.out.print(b[i][j] + " ");//IMP
			}
			System.out.println();
		}
		
	}

}
