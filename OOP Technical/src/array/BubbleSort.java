package array;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		not user input
		int elements[] = {22,11,07,15,17,665,65,-9,985,-955,-65,65,0,7,350,8,4};
		int n = elements.length;
		
		for(int i = 0 ; i<n-1;i++) {
			for(int j = 0;j<n-1;j++) {
				if(elements[j+1] < elements[j]) {
					int temp;
					temp = elements[j+1];
					elements[j+1] = elements[j];
					elements[j] = temp;
				}
			}
		}
		for(int k = 0;k<n;k++) {
			System.out.print(elements[k] + " ");
		}
		
//		User input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n1 = sc.nextInt();
		int a[] = new int[n1];
		System.out.println("Enter elements of array : ");
		for(int i = 0;i<n1 ; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int k = 0;k<n1-1;k++) {
			for(int j = 0;j<n1-1 ;j++) {
				if(a[j+1] < a[j]) {
					int temp;
					temp = a[j+1];
					a[j+1] = a[j];
					a[j]=temp;
				}
			}
		}
		for(int item : a) {
			System.out.print(item + " ");
		}
		
		}

}
