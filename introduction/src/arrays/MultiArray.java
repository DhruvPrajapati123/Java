package arrays;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[5][3];
		System.out.println(a[2][1]);
		a[2][1] = 65;
		System.out.println(a[2][1]);
		
		int b[][] = {{2,8,9,2,5},{4,8,9},{4,8,6,4,7}};
		System.out.println(b[2][3]);
		
		int c[][] = {{2,1,1,}, {3,2,1}, {5,1,2}};
		for(int i = 0;i<=2;i++) {
			for(int j = 0 ; j<=2 ;j++) {
				System.out.print(c[i][j] + " ");
			}
		}
	}

}
