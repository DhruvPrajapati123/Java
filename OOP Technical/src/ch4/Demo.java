package ch4;
class ObjDemo{
	int height;
	int width;
	ObjDemo(int height , int width){
		this.height = height;
		this.width = width;
	}
//	void getArea(){
//		System.out.println(height*width);
//	}
	
	void getArea(ObjDemo o){
		System.out.println((height + o.height)*(width+o.width));
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjDemo obj1 = new ObjDemo(2,3);
//		obj1.getArea();
		ObjDemo obj2 = new ObjDemo(10,20);
//		obj2.getArea();	
		obj1.getArea(obj2);
	}

}
