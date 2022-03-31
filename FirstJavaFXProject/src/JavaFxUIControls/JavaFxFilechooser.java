package JavaFxUIControls;
//The FileChooser class provides two types of methods,
//
//
//1. showOpenDialog()
//2. showSaveDialog()
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
public class JavaFxFilechooser extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
//		The following code implements showSaveDialog() method.
//		FileChooser file = new FileChooser();
//		file.setTitle("Open file");
//		file.showOpenDialog(primaryStage);
//		file.showSaveDialog(primaryStage);
		
		Label label = new Label("File:");  
        TextField tf= new TextField();  
        Button btn = new Button("Browse");  
        btn.setOnAction(e->  
        {  
            FileChooser file = new FileChooser();  
            file.setTitle("Open File");  
            file.showOpenDialog(primaryStage);  
        });  
		HBox root = new HBox();
		root.setSpacing(20);
		root.getChildren().addAll(label,tf,btn);
        Scene scene = new Scene(root,350,100);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("FileChooser Example");  
        primaryStage.show();
	}

}
