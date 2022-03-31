package ch4;
class People{
	String name;
	int rollno;
	double marks;
	
	public void display(String name,int rollno,double marks) {
		System.out.println();
		System.out.println("name: " + name);
		System.out.println("rollno: " + rollno);
		System.out.println("marks: " + marks);
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1 = new People();
		People p2 = new People();
		People p3 = new People();
		p1.display("Dhruv", 23, 65);
		p2.display("Dhruv1", 2, 65);
		p3.display("Dhruv2", 53, 95);
	}

}
