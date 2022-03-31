package array;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[][][] = new int[2][3][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<2;k++) {
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<2;k++) {
					System.out.println("a[" +i+ "]["+j+"]["+k +"]" + a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
