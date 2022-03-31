package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int cols = sc.nextInt();
		
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		
		System.out.println("Enter Array a :");
		for(int i = 0 ; i<rows ; i++) {
			for(int j = 0; j<cols ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter Array b :");
		for(int i = 0 ; i<rows ; i++) {
			for(int j = 0; j<cols ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int c[][] = new int[rows][cols];
		
		for(int i = 0 ; i<rows ; i++) {
			for(int j = 0; j<cols ; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Result array c is :");
		for(int i = 0 ; i<rows ; i++) {
			for(int j = 0; j<cols ; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
