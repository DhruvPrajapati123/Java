package ch4;
import java.util.*;
public class Circle {
	double radius;
	double area = 0.0;
	
	Circle(double r){
		area = 0.0;
		radius = r;
	}
	double areaFunction() {
		return area = 3.14 * radius * radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(10);
		System.out.println("radius: " + c1.radius);
		System.out.println("area: " +c1.areaFunction());
		Date date  = new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		date.setHours(17);
		System.out.println(date.getHours());
		System.out.println(date);
	}

}
