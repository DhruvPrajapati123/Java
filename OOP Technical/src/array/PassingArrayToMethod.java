package array;
import java.util.Scanner;
public class PassingArrayToMethod {
	
	static void put_data(int a[] , int n) {
		for(int i =0;i<=n-1 ;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the element: ");
			a[i] = sc.nextInt();
		}
	}
	
	static void get_data(int a[] , int n) {
		System.out.println("the elements are: ");
		for(int i =0;i<=n-1 ;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elemets: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		put_data(a,n);
		get_data(a,n);
		
	}

}
