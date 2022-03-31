package ch3;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("length of array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter the elements");
			a[i] = sc.nextInt();
		}
		System.out.println("The array is: ");
		for(int i = 0;i<n;i++) {
			System.out.println(a[i] + " ");
		}
		
		System.out.println("sorted array is:");
		Arrays.sort(a);
		for(int i = 0 ; i<n ; i++) {
			System.out.println(a[i] + " ");
		}
		
		int key = sc.nextInt();
		System.out.println(Arrays.binarySearch(a, key));
		
	}

}
