package array;

import java.util.Scanner;

public class MatricMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter the number of colomns: ");
		int column = sc.nextInt();
		
//		Array A
		int a[][] = new int[row][column];
		System.out.println("Enter the matrix A: ");
		for(int i = 0;i<=row-1;i++) {
			for(int j = 0 ; j <=column-1;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
//		Array B 
		int b[][] = new int[row][column];
		System.out.println("Enter the matrix B: ");
		for(int i = 0;i<=row-1;i++) {
			for(int j = 0 ; j <=column-1;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
//		
		int c[][] = new int[row][column];
		System.out.println("The matrix c will be : ");
		for(int i = 0;i<=row-1;i++) {
			for(int j = 0 ; j <=column-1;j++) {
				c[i][j] = 0;
				for(int k = 0;k<=column-1;k++) {
					c[i][j] = c[i][j] + a[i][j] * b[i][j];
				}
			}
		}
		for(int i = 0;i<=row-1;i++) {
			for(int j = 0 ; j <=column-1;j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	
	}

}
