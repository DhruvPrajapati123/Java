package JavaFxUIControls;
//Progress Bar is used to show the work progress to the user. It is represented
//by javafx.scene.control.ProgressBar. The following code implements progrss 
//bar into our application.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProgressBarFx extends Application {
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new VBox();
		ProgressBar progress = new ProgressBar();
		ProgressBar p2 = new ProgressBar();  
		p2.setProgress(0.25f); 
		root.getChildren().addAll(progress,p2);
		Scene scene = new Scene(root, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Progress Bar Example");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
