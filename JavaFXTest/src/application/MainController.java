package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class MainController {
	@FXML
	private Label myMessage;
	public void generateRandom(ActionEvent event) {
		Random myRandom = new Random();
		int random = myRandom.nextInt(50) ;
		myMessage.setText(Integer.toString(random));
//		System.out.println(Integer.toString(random));
	}
}
