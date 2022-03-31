package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		for(int i = 1;i<=n;i++) {
			sum = sum + (double)1/i;
		}
		System.out.println("Sum = " + sum);
//		for(int i = 1;i<=n ; i++) {
//			if(i % 2==0) {
//				sum = sum - (double)1/i;
//			}else {
//				sum = sum + (double)1/i;
//			}
//		}
//		System.out.println("sum = " + sum);
		
	}

}
