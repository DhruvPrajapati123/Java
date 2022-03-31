package application;  

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;  
import javafx.stage.Stage;  
public class text extends Application{  
@Override  
public void start(Stage primaryStage) throws Exception {  
    // TODO Auto-generated method stub  
    Text text = new Text();
    text.setFont(Font.font("Abyssinica SIL",FontWeight.BOLD,FontPosture.REGULAR,20));  
    text.setFill(Color.BLUE);// setting colour of the text to blue   
    text.setStroke(Color.BLACK); // setting the stroke for the text    
    text.setStrokeWidth(1); 
    text.setText("hello welcome to the javafx tutorial");
    StackPane root = new StackPane();  
    Scene scene = new Scene(root,300,400);  
    root.getChildren().add(text);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Text Example");  
    primaryStage.show();  
}  
public static void main(String[] args) {  
    launch(args);  
      
}  
}  
