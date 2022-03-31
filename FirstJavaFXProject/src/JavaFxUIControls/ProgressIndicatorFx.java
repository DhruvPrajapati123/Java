package JavaFxUIControls;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;  
public class ProgressIndicatorFx extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        ProgressIndicator PI=new ProgressIndicator();  
        ScrollBar s = new ScrollBar();    
        VBox root = new VBox(); 
        root.getChildren().addAll(s,PI);
        root.setSpacing(100); 
        Scene scene = new Scene(root,300,200);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Progress Indicator Example");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
  
}  
