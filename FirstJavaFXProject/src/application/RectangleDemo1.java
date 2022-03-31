//package application;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Line;
//import javafx.stage.Stage;
//public class RectangleDemo1 extends Application{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		launch(args);
//	}
//
//	@Override
//	public void start(Stage arg0) throws Exception {
//		// TODO Auto-generated method stub
//		
////		Line line = new Line();
////		line.setStartX(0.0);
////		line.setStartY(0.0);
////		line.setEndX(100.0);
////		line.setEndY(200.0);
//		Line line1 = new Line(10,50,150,50);
//		Line line2 = new Line(10,100,150,100);
//		Line line3 = new Line(10,50,10,100);
//		Line line4 = new Line(150,50,150,100);
//		StackPane root = new StackPane();
//		root.getChildren().addAll(line1,line2,line3,line4);
//		Scene scene = new Scene(root,300,300,Color.BLUE);
//		arg0.setScene(scene);
//		arg0.setTitle("Rectangle");
//		arg0.show();
//	}
//
//}

package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class RectangleDemo1 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.setHeight(100.0);
		r.setWidth(200.0);
		r.setX(10.0);
		r.setY(10.0);
		r.setFill(Color.RED);
		r.setArcHeight(35.0);
		r.setArcWidth(35.0);
		StackPane root = new StackPane();
		root.getChildren().add(r);
		Scene scene = new Scene(root,300,300);
		arg0.setScene(scene);
		arg0.setTitle("Rectangle");
		arg0.show();
	}

}
