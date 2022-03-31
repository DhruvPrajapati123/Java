package JavaFx3DShapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
public class SphereTes extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		  //Creating the first sphere   
	    Sphere sphere = new Sphere();  
	    sphere.setRadius(50);  
	    sphere.setTranslateX(100);  
	    sphere.setTranslateY(200);  
	    
	    //Setting cullface for the sphere 1   
	    sphere.setCullFace(CullFace.BACK); 
	    
	    //creating second sphere   
	    Sphere sphere1 = new Sphere();  
	    sphere1.setRadius(50);  
	    sphere1.setTranslateX(250);  
	    sphere1.setTranslateY(200);  
	      
	    //setting CullFace for the sphere 2  
	    sphere1.setCullFace(CullFace.FRONT);  
	    
	    //creating third sphere   
	    Sphere sphere2 = new Sphere();  
	    sphere2.setRadius(50);  
	    sphere2.setTranslateX(400);  
	    sphere2.setTranslateY(200);  
	      
	    //setting CullFace for the sphere 3  
	    sphere2.setCullFace(CullFace.NONE);  
	    
		StackPane root = new StackPane();
		root.getChildren().addAll(sphere,sphere1,sphere2);
		Scene scene = new Scene(root,600,600);
		arg0.setScene(scene);
		arg0.setTitle("Sphare Test example");
		arg0.show();
		
	}

}
