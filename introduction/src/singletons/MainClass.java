package singletons;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AppConfig obj1 = new AppConfig();
//		AppConfig obj2 = new AppConfig();
		
		AppConfig obj = AppConfig.getInstance();
		AppConfig obj1 = AppConfig.getInstance();
		AppConfig obj2 = AppConfig.getInstance();
		
	}

}
