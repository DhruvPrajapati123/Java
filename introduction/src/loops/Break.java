package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1 ; i<=100;i++) {
//			if(i==45) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		Scanner sc = new Scanner(System.in);
		for( ; ;) {
			int n = sc.nextInt();
			if(n<0) {
				break;
			}
		}
	}

}
