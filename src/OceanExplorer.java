import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OceanExplorer extends Application {

	public void start(Stage oceanStage) throws Exception {
		AnchorPane myPane = new AnchorPane();
		Scene scene = new Scene(myPane, 640, 480);
		oceanStage.setScene(scene);
		oceanStage.setTitle("Christopher Columbus Game");
		oceanStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
