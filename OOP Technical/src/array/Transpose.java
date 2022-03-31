package array;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1st method
		int original[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int transpose[][] = new int[3][3];

		System.out.println("Original matrix : ");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				transpose[i][j] = original[i][j];
			}
		}

		System.out.println("Transpose matrix : ");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(transpose[j][i] + " ");
			}
			System.out.println();
		}

//		2 nd Method

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int cols = sc.nextInt();

		System.out.println("Enter the values of matrix: ");
		int a[][] = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("The original matrix is : ");
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
//		to find transpose
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		System.out.println("Transpose matrix: ");
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j < cols - 1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
