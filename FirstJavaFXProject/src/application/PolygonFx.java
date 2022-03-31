package application;
import javafx.scene.shape.Polygon;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PolygonFx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Polygon p = new Polygon();
		p.getPoints().addAll(new Double[]{  
			        0.0, 0.0,  
			        100.0, 200.0,  
			        200.0, 100.0 });  
		p.setFill(Color.rgb(23,65,42,0.36));
		StackPane root = new StackPane();
		root.getChildren().add(p);
		Scene scene = new Scene(root,300,300);
		arg0.setTitle("Circle");
		arg0.setScene(scene);
		arg0.show();
	}

}
