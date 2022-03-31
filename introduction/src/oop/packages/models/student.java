package oop.packages.models;

public class student {
	
	
//	access Modifiers : public , private , protected , default
//	private : access with in the class
//	public: access everywere
//	protected: The access level of protected modifier is with in the packages and outside the
//	packages through child class.If you do not make the child class it can not be accssed
//	from outside thepackags.
//	default: access with in the packages
	
	public String name;
	
	public student(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getPass() {
		return "Dhruv123";
	}
}
