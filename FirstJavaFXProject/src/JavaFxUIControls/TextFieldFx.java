package JavaFxUIControls;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;
public class TextFieldFx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Label l = new Label("First name: ");
		Label l1 = new Label("Last name: ");
		TextField tx1 = new TextField();
		TextField tx2 = new TextField();
		Button btn = new Button("Submit");
		btn.setOnAction(e -> System.out.println("The First name is: " + tx1.getText()
		+ " and the last name is: " + tx2.getText()));
		GridPane root = new GridPane();
		root.addRow(0, l,tx1);
		root.addRow(1, l1,tx2);
		root.addRow(2, btn);
		
		Scene scene = new Scene(root,300,300);
		primaryStage.setTitle("This is example of textfield");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
