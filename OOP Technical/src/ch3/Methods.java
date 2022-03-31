package ch3;
import java.util.*;

public class Methods {
	
//	 static int sum(int x , int y) {
//		int z = x + y;
//		return z;
//	}
//	
//	 static int min(int a , int b) {
//		if(a<b) {
//			return a;
//		}else {
//			return b;
//		}
//	}
//	
//	static void sum1(int num1 , int num2) {
//		int ans = num1 + num2;
//		System.out.println(ans);
//	}
	
	static void display(int r , String name) {
		System.out.println("Roll no: " + r);
		System.out.println("Name : " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(sum(56,45));
//		System.out.println(min(8,5));
//		sum1(56,75);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no : ");
		int rollno = sc.nextInt();
		System.out.println("Enter the name : ");
		String nam = sc.nextLine();
		display(rollno,nam);
		
	}
	
	

}
