package JavaFxUIControls;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class CheckBoxFx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Label l  = new Label("Select the fruits: ");
		CheckBox c1 = new CheckBox("Banana");
		CheckBox c2 = new CheckBox("Apple");
		CheckBox c3 = new CheckBox("Orange");
		CheckBox c4 = new CheckBox("Poteto");
		CheckBox c5 = new CheckBox("Onion");
		HBox root = new HBox();                
	    root.getChildren().addAll(l,c1,c2,c3,c4,c5);  
	    root.setSpacing(10);
	    Scene scene=new Scene(root,800,200);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("CheckBox Example");  
	    primaryStage.show();  
	}

}
