package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of array : ");
		int n1 = sc.nextInt();
		int a[] = new int[n1];
		int n = a.length;
		System.out.print("Enter the array : ");
		for(int i = 0 ;i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i<n-1 ; i++) {
			boolean sorted = true;
			for(int j = 0 ; j<n-1-i ; j++) {
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
					sorted = false;
				}
			}
			if(sorted) break;
		}
		
//		To print sorted array here we use forEach loop
		System.out.println("Sorted array is : ");
		for(int item : a) {
			System.out.print(item + " ");
		}

	}

}
