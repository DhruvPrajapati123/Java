package arrays;

public class BubbleSortNotUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5 , 7 , -6 , -2 , 2 , 1 , 6};
		int n = a.length;
		
		for(int i = 0 ; i < n-1 ; i++) {
			boolean sorted = true;
			for(int j = 0 ; j < n-1 ; j++) {
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
