package array;

public class GtuWiter2015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40};
		int n = a.length;
		int sum = 0;
		for(int i = 0 ; i <=n-1;i++) {
			sum = sum + a[i];
		}
		int avg = sum/n;
		System.out.println("Sum is : " + sum);
		System.out.println("Avg is : " + avg);
	}

}
