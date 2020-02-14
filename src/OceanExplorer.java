import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OceanExplorer extends Application {
	
	AnchorPane myPane = new AnchorPane();
	final int dimension = 10;
	final int scale = 50;
	Scene scene = new Scene(myPane, scale*dimension, scale*dimension);
	Image shipImage;
	ImageView shipImageView;
	OceanMap oceanMap = new OceanMap();
	boolean[][] oceanGrid = oceanMap.getMap();
	Ship ship = new Ship(5, 5);
	
	
	public void start(Stage oceanStage) throws Exception {
		
		oceanStage.setScene(scene);
		oceanStage.setTitle("Christopher Columbus Game");
		oceanStage.show();
		drawMap();
		loadShipImage();
		startSailing();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void drawMap() {
		for (int x = 0; x < dimension; x++) {
			for (int y = 0; y < dimension; y++) {
				Rectangle rect = new Rectangle(x*scale, y*scale, scale, scale);
				rect.setStroke(Color.BLACK);
				rect.setFill(Color.AQUAMARINE);
				myPane.getChildren().add(rect);
			}
		}
	}
	
	public void loadShipImage() {
		shipImage = new Image("ship.png", 50, 50, true, true);
		shipImageView = new ImageView(shipImage);
		shipImageView.setX(ship.getShipLocation().x * scale);
		shipImageView.setY(ship.getShipLocation().y * scale);
		myPane.getChildren().add(shipImageView);
	}
	
	private void startSailing() {
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent ke) {
				switch(ke.getCode())
				{
					case RIGHT:
						ship.goEast();
						break;
					case LEFT:
						ship.goWest();
						break;
					case UP:
						ship.goNorth();
						break;
					case DOWN:
						ship.goSouth();
						break;
					default:
						break;
				}
				shipImageView.setX(ship.getShipLocation().x * scale);
				shipImageView.setY(ship.getShipLocation().y * scale);
			}
		});	
	}

}