package arrays;

import java.util.Scanner;

public class SelectionSortUserInput {

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
		
		for(int i = 0 ; i < n-1 ; i++) {
			int minIndex = i;
			for(int j = i ; j < n ;j++) {
				if(a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
			
		}
//		To print sorted array here we use forEach loop
		System.out.println("Sorted array is : ");
		for(int item : a) {
			System.out.print(item + " ");
		}

	}

}
