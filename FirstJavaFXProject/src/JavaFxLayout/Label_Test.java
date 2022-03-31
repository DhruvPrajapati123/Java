package JavaFxLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage; 
public class Label_Test extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane BPane = new BorderPane();
		BPane.setLeft(new Label("This will be at the left"));
		BPane.setRight(new Label("This will be at the right"));
		BPane.setTop(new Label("This will be at the top"));
		BPane.setBottom(new Label("This will be at the bottom"));
		BPane.setCenter(new Label("This will be at the center"));
		Scene scene = new Scene(BPane,600,400);  
	    primaryStage.setScene(scene);  
        primaryStage.show();  
	}

}
