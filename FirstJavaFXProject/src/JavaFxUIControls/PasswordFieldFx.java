package JavaFxUIControls;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;
public class PasswordFieldFx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Label l = new Label("username: ");
		PasswordField pass = new PasswordField();
		pass.setPromptText("Password: ");
		TextField tx1 = new TextField();
		Label tx2 = new Label("Password: ");
		Button btn = new Button("Submit");
		btn.setOnAction(e -> System.out.println("The user name is: " + tx1.getText()
		+ " and the password is: " + pass.getText()));
		GridPane root = new GridPane();
		root.addRow(0, l,tx1);
		root.addRow(1,tx2, pass);
		root.addRow(2, btn);
		
		Scene scene = new Scene(root,300,300);
		primaryStage.setTitle("This is example of textfield");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
