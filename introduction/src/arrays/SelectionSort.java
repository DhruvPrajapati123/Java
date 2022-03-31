package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,1,-2,7,4,0,5,-6};
		int n = a.length;
		
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
