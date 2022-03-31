package JavaFxUIControls;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class JavaFxMenu extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
//		Creating menubar
		MenuBar mb = new MenuBar();
		
//		Creating first menu
		Menu m = new Menu("File");
//		Add items in to the first menu
		MenuItem mi = new MenuItem("New");
		MenuItem mi1 = new MenuItem("Save");
		MenuItem mi2= new MenuItem("Exit");
		
//		Creating second menu
		Menu m1 = new Menu("Edit");
//		add items in to the second menu
		MenuItem mi0 = new MenuItem("Cut");
		MenuItem mi11 = new MenuItem("Copy");
		MenuItem mi22= new MenuItem("Paste");
		
		
		m.getItems().addAll(mi,mi1,mi2);
		m1.getItems().addAll(mi0,mi11,mi22);
		
		mb.getMenus().addAll(m,m1);
		
		BorderPane root = new BorderPane();
		root.setTop(mb);
		Scene scene = new Scene(root,200,300);
		arg0.setTitle("Menubar");
		arg0.setScene(scene);
		arg0.show();
		
	}

}
