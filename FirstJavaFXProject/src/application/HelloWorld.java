package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class HelloWorld extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn = new Button("Hello World");
		btn.setOnAction(e -> System.out.println("Hello World"));
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root,300,300);
		root.getChildren().add(btn);
		primaryStage.setTitle("Printing Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
