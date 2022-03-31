package ch4;
//In object return from method, the method name is same as classname
class ObjReturnDemo{
	int a;
	ObjReturnDemo(int a){
		this.a = a;
	}
	ObjReturnDemo method() {
		ObjReturnDemo temp = new ObjReturnDemo(a+5);
		return temp;
	}
	
}

public class ObjReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjReturnDemo obj2 = new ObjReturnDemo(20);
		ObjReturnDemo obj1;
		obj1 = obj2.method();
		System.out.println(obj1.a);
	}

}
