package ch5;
class Shape {
	int height,width;
	void setValue(int h , int w) {
		height = h;
		width = w;
	}
}

class Ractangle extends Shape{
	 void getArea() {
		 System.out.println("Area is : " + height*width);
	 }
}
public class RactangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ractangle r = new Ractangle();
		r.setValue(10, 20);
		r.getArea();
	}

}
