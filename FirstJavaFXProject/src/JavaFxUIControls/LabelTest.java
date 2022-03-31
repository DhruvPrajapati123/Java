package JavaFxUIControls;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class LabelTest extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream input = new FileInputStream("D:/java/FirstJavaFXProject/src/JavaFxUIControls/72975551.jpg");
		Image image = new Image(input);
		ImageView imageview = new ImageView(image);
		Label l = new Label("This is the example of label",imageview);
		StackPane root = new StackPane();
		root.getChildren().add(l);
		Scene scene = new Scene(root,300,300);
		arg0.setTitle("Label example");
		arg0.setScene(scene);
		arg0.show();
	}

}
