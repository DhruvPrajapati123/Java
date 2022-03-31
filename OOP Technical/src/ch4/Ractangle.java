package ch4;
//Use of constructor is to initialized to the data members of the class

public class Ractangle {
	
	int height;              //data fields
	int width;
	
	Ractangle(){             //simple constructor or no-arg constuctor
		System.out.println("No arg constructor initialized");
		height = 10;
		width = 20;
	}
	
	Ractangle(int height , int width){
		System.out.println("parameterised constructor called");
		this.height = height;
		this.width = width;
	}
	
	void area() {
		System.out.println("method were called");
		System.out.println(height*width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ractangle r1 = new Ractangle();
		r1.area();
		
		Ractangle r2 = new Ractangle(20,100);
		r2.area();
	}

}
