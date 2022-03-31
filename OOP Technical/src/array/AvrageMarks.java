package array;
import java.util.Scanner;
public class AvrageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		System.out.println("enter the marks: ");
		for(int i = 0 ; i<marks.length;i++) {
			marks[i] = sc.nextInt();
		}
		double avgMarks = 0;
		for(int i = 0 ; i<marks.length ;i++) {
			avgMarks = avgMarks + marks[i];
		}
		avgMarks /= n;
		System.out.println("The avg marks are : " + avgMarks);
		
	}

}
