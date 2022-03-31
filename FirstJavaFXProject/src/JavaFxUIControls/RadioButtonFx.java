package JavaFxUIControls;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class RadioButtonFx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		ToggleGroup tg = new ToggleGroup();
		RadioButton btn1 = new RadioButton("Option 1");
		RadioButton btn2 = new RadioButton("Option 2");
		RadioButton btn3 = new RadioButton("Option 3");
		RadioButton btn4 = new RadioButton("Option 4");
		
		btn1.setToggleGroup(tg);
		btn2.setToggleGroup(tg);
		btn3.setToggleGroup(tg);
		btn4.setToggleGroup(tg);
		
		VBox root = new VBox();
		root.setSpacing(10);
		root.getChildren().addAll(btn1,btn2,btn3,btn4);
		Scene scene = new Scene(root,300,300);
		arg0.setTitle("Radio Button Example");
		arg0.setScene(scene);;
		arg0.show();
		
	}

}
