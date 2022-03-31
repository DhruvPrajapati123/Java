package MediaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;  
public class PlayingAudioFx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Media media = new Media("https://file-examples-com.github.io/uploads/2017/11/file_example_MP3_700KB.mp3");
		MediaPlayer mp = new MediaPlayer(media);
		MediaView mediaView = new MediaView (mp) ;
//		Button btn = new Button("Play");
		mp.setAutoPlay(true);  
		StackPane root = new StackPane();
		Scene scene = new Scene(root);
		root.getChildren().add(mediaView);
//		arg0.setScene(scene);
		arg0.setTitle("Playing audio");
		arg0.show();
	}

}
