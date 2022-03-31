package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class CircleDemo extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		c.setCenterX(100);
		c.setCenterY(100);
		c.setRadius(100);
		c.setFill(Color.RED);
		StackPane root = new StackPane();
		root.getChildren().add(c);
		Scene scene = new Scene(root,300,300);
		arg0.setTitle("Circle");
		arg0.setScene(scene);
		arg0.show();
	}

}
