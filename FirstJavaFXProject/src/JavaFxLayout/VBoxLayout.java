package JavaFxLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class VBoxLayout extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Button btn1 = new Button("Button1");
		Button btn2 = new Button("Button2");
	
		VBox root = new VBox(); 
		root.setSpacing(10);
        Scene scene = new Scene(root,200,200);  
        root.getChildren().addAll(btn1,btn2);  
        primaryStage.setScene(scene);  
        primaryStage.show();  
	}

}
