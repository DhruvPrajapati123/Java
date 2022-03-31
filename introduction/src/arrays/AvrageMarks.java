package arrays;

import java.util.Scanner;

public class AvrageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		System.out.println("Enter the marks : ");
		for(int i = 0; i<n ; i++) {
			marks[i] = sc.nextInt();
		}
		 double averageMarks = 0;
		 
		for(int i = 0 ; i<n ; i++) {
			averageMarks += marks[i];
		}
		
		averageMarks /= n;
		
		System.out.println("The average marks of students is : " + averageMarks);
		 

	}

}
