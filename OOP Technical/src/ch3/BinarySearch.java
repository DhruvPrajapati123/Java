package ch3;

public class BinarySearch {
	
	static void find(int a[] , int key, int low , int high) {
		int mid;
		if(low > high) {
			System.out.println("error");
			return ;
		}
		mid = (low + high)/2;
		if(key == a[mid]) {
			System.out.println(mid);
		}else if(key< a[mid]){
			find(a,key,low,mid-1);
		}else if(key>a[mid]) {
			find(a,key,mid+1,high);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9};
		find(a,5,0,8);
		find(a,4,0,8);
		find(a,9,0,8);
		find(a,2,0,8);
	}

}
