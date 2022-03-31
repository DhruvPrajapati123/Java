package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;
public class ArcFx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Arc a = new Arc();
		a.setCenterX(100);
		a.setCenterY(100);
		a.setRadiusX(50);
		a.setRadiusY(80);
		a.setStartAngle(30);
		a.setLength(70);
		a.setFill(Color.RED); 
		StackPane root = new StackPane();
		root.getChildren().add(a);
		Scene scene = new Scene(root,300,300);
		arg0.setTitle("Arc");
		arg0.setScene(scene);
		arg0.show();
		
	}

}
