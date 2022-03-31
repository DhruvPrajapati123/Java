package JavaFx3DShapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
public class MaterialExample extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		 //Creating Cylinder 1  
	    Cylinder cyn = new Cylinder();  
	    cyn.setRadius(70);  
	    cyn.setHeight(200);  
	    cyn.setTranslateX(180);  
	    cyn.setTranslateY(150);  
	    
	    //Creating cylinder 2   
	    Cylinder cyn1=new Cylinder();  
	    cyn1.setRadius(70);  
	    cyn1.setHeight(200);  
	    cyn1.setTranslateX(380);  
	    cyn1.setTranslateY(150);  
	      
	    //Creating cylinder 3  
	    Cylinder cyn2=new Cylinder();  
	    cyn2.setRadius(70);  
	    cyn2.setHeight(200);  
	    cyn2.setTranslateX(580);  
	    cyn2.setTranslateY(150); 
	    
	    //Creating Sphere   
	    Sphere s=new Sphere();  
	    s.setRadius(70);  
	    s.setTranslateX(780);  
	    s.setTranslateY(150); 
	    
		StackPane root = new StackPane();
		root.getChildren().addAll(cyn,cyn1,cyn2,s);
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("material Example");
		arg0.show();
	}

}
