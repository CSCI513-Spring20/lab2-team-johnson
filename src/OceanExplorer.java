import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OceanExplorer extends Application {
	
	
	public void start(Stage oceanStage) throws Exception {
		final int dimension = 10;
		final int scale = 50;
		OceanMap oceanMap = new OceanMap();
		boolean[][] oceanGrid = oceanMap.getMap();
		AnchorPane myPane = new AnchorPane();
		Scene scene = new Scene(myPane, scale*dimension, scale*dimension);
		
		oceanStage.setScene(scene);
		oceanStage.setTitle("Christopher Columbus Game");
		oceanStage.show();
		
		for (int x = 0; x < dimension; x++) {
			for (int y = 0; y < dimension; y++) {
				Rectangle rect = new Rectangle(x*scale, y*scale, scale, scale);
				rect.setStroke(Color.BLACK);
				rect.setFill(Color.PALETURQUOISE);
				myPane.getChildren().add(rect);
			}
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
