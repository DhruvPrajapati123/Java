package JavaFxLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class HBoxLayout extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn1 = new Button("Button1");
		btn1.setOnAction(e -> System.out.println("Hello world1"));
		Button btn2 = new Button("Button2");
		btn2.setOnAction(e -> System.out.println("Hello world2"));
		Button btn3 = new Button("Button3");
		btn3.setOnAction(e -> System.out.println("Hello world3"));
		HBox root = new HBox();  
		root.setSpacing(30);
		Scene scene = new Scene(root,200,300);  
		root.getChildren().addAll(btn1,btn2,btn3);  
		  
		primaryStage.setScene(scene);  
		primaryStage.show();  
	}

}
