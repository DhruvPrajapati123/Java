package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;
public class EclipseDemo extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Ellipse e = new Ellipse();
		e.setCenterX(100);
		e.setCenterY(100);
		e.setRadiusX(100);
		e.setRadiusY(70);
		e.setFill(Color.RED);
		StackPane root = new StackPane();
		root.getChildren().add(e);
		Scene scene = new Scene(root,300,300);
		arg0.setScene(scene);
		arg0.setTitle("Ellipse");
		arg0.show();

	}

}
