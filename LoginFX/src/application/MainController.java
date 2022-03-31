package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField password;
	
	public void Login(ActionEvent event) throws Exception {
		if(username.getText().equals("dhruvprajapati"
				+ "8200@gmail.com") && password.getText().equals("Nilkanth@12")){
			lblStatus.setText("Login Success");
			Stage primaryStage =  new Stage();
			Parent root  = FXMLLoader.load(getClass().getResource("/appli"
					+ "cation/Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}else {
			lblStatus.setText("Login Failed");
		}
	}
	
}
