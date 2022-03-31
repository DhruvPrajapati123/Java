package ch3;

public class LinearSearch {
	static int find(int a[] , int key) {
		for(int i = 0 ; i<a.length;i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,9,1,3,6,4,7};
		System.out.println(find(a,1));
		System.out.println(find(a,6));
		System.out.println(find(a,7));
		
	}

}
