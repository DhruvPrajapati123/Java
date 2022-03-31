package JavaFxLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GridPaneLayout extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Label lb1 = new Label("First name: ");
		Label lb2 = new Label("Last name: ");
		TextField tx1 = new TextField();
		TextField tx2 = new TextField();
		Button submit = new Button("Submit");
		GridPane root = new GridPane();
		root.addRow(0, lb1 , tx1);
		root.addRow(1, lb2,tx2);
		root.addRow(2, submit);
		Scene scene = new Scene(root,400,200);  
		//Adding CSS file to the root   
		root.getStylesheets().add("/application/application.css"); 
        primaryStage.setScene(scene);  
        primaryStage.show();  
	}

}
