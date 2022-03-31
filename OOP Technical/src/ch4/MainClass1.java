package ch4;

import java.util.Scanner;

class Student{
	int rollno;
	String name;
	int total;
	double avg;
	int sub1,sub2,sub3,sub4,sub5;
	
	Student(){
		rollno = 0;
		name = null;
		total = 0;
		avg = 0;
		int sub1,sub2,sub3,sub4,sub5 = 0;
	}
	
	void get_data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student:");
		name = sc.nextLine();
		System.out.print("Enter the rollno: ");
		int rollno = sc.nextInt();
		System.out.print("Enter the marks of sub1: ");
		int sub1 = sc.nextInt();
		System.out.print("Enter the marks of sub2: ");
		int sub2 = sc.nextInt();
		System.out.print("Enter the marks of sub3: ");
		int sub3 = sc.nextInt();
		System.out.print("Enter the marks of sub4: ");
		int sub4 = sc.nextInt();
		System.out.print("Enter the marks of sub5: ");
		int sub5 = sc.nextInt();
	}
	void avg() {
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		avg = total/5;
		System.out.println(rollno + " " + name+" "+sub1+" "+sub2+" "+sub3+" "+sub4+" "+sub5
				+" "+total+" "+avg+ " ");
	}
	
}

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s[] = new Student[5];
		for(int i=0;i<5;i++) {
			 s[i] = new Student();
			 s[i].get_data();
		}
		System.out.println("rollno name     sub1 sub2 sub3 sub4 sub5 total avg");
		for(int i = 0;i<5;i++) {
			s[i].avg();
		}
	}

}
